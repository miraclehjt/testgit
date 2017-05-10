package oom.controller;

import javax.servlet.http.HttpServletRequest;

import oom.common.ApiUtils;
import oom.common.Constants;
import oom.common.JsonMapper;
import oom.core.InterfaceConfig;
import oom.vo.ShopDetailList;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 店铺相关页面控制器类
 * 
 * Created by Administrator on 2016/3/7.
 */
@Controller
@RequestMapping("/shop")
public class ShopController extends BaseController {

	@Autowired
	protected InterfaceConfig app;
	
	@RequestMapping("/info")
	public String shopInfo(@RequestParam(value = "shopId", required=false)String shopId,Model model, HttpServletRequest request) {
		//String shopId = request.getParameter("shopId");
		String param = "";
		
		if(!StringUtils.isBlank(shopId)){
			param += ApiUtils.addParam(param, "SHOP_ID", shopId);
		}else{
			param += ApiUtils.addParam(param, "SHOP_ID", 4+"");
		}
		
		String result = ApiUtils.sendPost(app.getUrl() + Constants.APP_SHOP_DETAIL_URL, param, false);
		ShopDetailList shopDetailVo = JsonMapper.fromJson(result, ShopDetailList.class);
		
		model.addAttribute("shopDetail", shopDetailVo);
		model.addAttribute("goodsList", shopDetailVo.getGoodscateandgoods());
		return "shopInfo";
	}
}
