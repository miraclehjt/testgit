package oom.controller;

import javax.servlet.http.HttpServletRequest;

import oom.common.Constants;
import oom.common.CurrentUserInfo;

import org.springframework.ui.Model;

/**
 * 鍏叡鎺у埗鍣�
 *
 * Created by Administrator on 2016/3/15.
 */
public abstract class BaseController{
	
    /**
     * 鍒ゆ柇鏄惁鐧诲綍
     *
     * @param model
     * @param request
     * @return
     */
    protected void checkLogin(Model model, HttpServletRequest request){
        CurrentUserInfo userinfo = (CurrentUserInfo) request.getSession().getAttribute(Constants.SESSION_INFO_KEY);
        if(userinfo == null){
            //return "redirect:/login/toLogin";
        }else {
            //model.addAttribute("curUser",userinfo);
            /*if(userinfo.getNickname() == null || "".equals(userinfo.getNickname())){
                model.addAttribute("curUser", userinfo.getUsername());
            }else{
                model.addAttribute("userName",userinfo.getUsername());
            }*/
        }
        //return null;
    }

}
