package oom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 送餐地址控制器类
 *
 * Created by Administrator on 2016/3/7.
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    @RequestMapping("/index")
    public String toAddress(){
        return "address";
    }
}
