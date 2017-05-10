package oom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 订单控制器类
 *
 * Created by Administrator on 2016/3/7.
 */
@Controller
@RequestMapping("/order")
public class OrderController extends BaseController{


	 /**
     * 订单添加
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/orderAdd")
    public String orderAdd(Model model, HttpServletRequest request) {
        return "orderAdd";
    }
    
    /**
     * 订单详情
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/orderDetail")
    public String orderDetail(Model model, HttpServletRequest request) {
        return "orderDetail";
    }
    
    /**
     * 我的订单
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/orderList")
    public String orderList(Model model, HttpServletRequest request) {
        return "orderList";
    }

    /**
     * 下单成功
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/success")
    public String success(Model model, HttpServletRequest request) {
        return "success";
    }
   
}
