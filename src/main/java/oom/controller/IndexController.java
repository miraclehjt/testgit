package oom.controller;

import javax.servlet.http.HttpServletRequest;

import oom.common.ApiUtils;
import oom.common.Constants;
import oom.common.JsonMapper;
import oom.core.InterfaceConfig;
import oom.vo.GoodsInfoVo;
import oom.vo.GoodsList;
import oom.vo.ShopInfoList;
import oom.vo.ShopTypeList;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 首页控制器
 *
 * Created by Administrator on 2016/3/6.
 */
@Controller
@RequestMapping("/home")
public class IndexController extends BaseController{

	@Autowired
	protected InterfaceConfig app;

    /**
     * 跳转到首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String toIndex(@RequestParam(value = "pageNo",required = false,defaultValue = "1") int pageIndex,
                          @RequestParam(value = "pageSize",required = false,defaultValue = "10") int pageSize,
                          Model model, HttpServletRequest request) {
    	//商店列表
    	String result = ApiUtils.sendPost(app.getUrl() + Constants.APP_SHOP_QUERY_URL, "", false);
    	ShopInfoList shopList = JsonMapper.fromJson(result, ShopInfoList.class);
    	//System.out.println(list);
    	model.addAttribute("shopInfoList",shopList);
    	result = ApiUtils.sendPost(app.getUrl()+Constants.APP_SHOP_TYPE_URL, "", false);
    	ShopTypeList shopTypeList = JsonMapper.fromJson(result, ShopTypeList.class);
    	model.addAttribute("shopTypeList",shopTypeList);
        return  "index";
    }
    

    /**
     * 商品详情
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/goodsDetail")
    public String itemsDetail(@RequestParam(value = "goodsId",required = false) String goodsId,
    		@RequestParam(value = "goodsCateId",required = false)String goodsCateId,Model model, HttpServletRequest request) {
    	String param = "";
    	if(!StringUtils.isBlank(goodsId)){
    		param = ApiUtils.addParam(param, "GOODS_ID", goodsId);
    	}
    	
    	if(!StringUtils.isBlank(goodsCateId)){
    		param = ApiUtils.addParam(param, "GOODS_CATEGORY_ID", goodsCateId);
    	}
    	
    	String result = ApiUtils.sendPost(app.getUrl() + Constants.APP_SHOP_GOODS_QUERY_URL, param, false);
    	GoodsList goodsList = JsonMapper.fromJson(result, GoodsList.class);
    	
    	model.addAttribute("goodsList", goodsList);
    	
        return  "itemsDetail";
    }

}
