package oom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 店铺相关页面控制器类
 * 
 * Created by Administrator on 2016/3/7.
 */
@Controller
@RequestMapping("/shopcart")
public class ShopcartController extends BaseController {

	/**
     * 购物车
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/info")
    public String shopping(Model model, HttpServletRequest request) {
        return "shopping";
    }
}
