package oom.controller;

import javax.servlet.http.HttpServletRequest;

import oom.common.ApiUtils;
import oom.common.Constants;
import oom.common.JsonMapper;
import oom.common.JsonResult;
import oom.common.UserUtils;
import oom.core.InterfaceConfig;
import oom.vo.LoginVo;
import oom.vo.RegisterVo;
import oom.vo.ResultLoginVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 鐧诲綍椤垫帶鍒跺櫒绫�
 *
 * Created by Administrator on 2016/3/7.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	protected InterfaceConfig app;

    /**
     * 璺宠浆鍒扮櫥褰曢〉闈�
     *
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 璺宠浆鍒版敞鍐岄〉闈�
     *
     * @return
     */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/registerSubmit")
    @ResponseBody
    public Object registerSubmit(RegisterVo registerVo, Model model, HttpServletRequest request) {
		String param = "";

		param = ApiUtils.addParam(param, "OPNO", registerVo.getUsername());
		param = ApiUtils.addParam(param, "PWD", registerVo.getPassword());
		param = ApiUtils.addParam(param, "SURE_PWD",
				registerVo.getCfgPassword());
		param = ApiUtils.addParam(param, "MPHONE", registerVo.getPhone());
		param = ApiUtils.addParam(param, "USER_TYPE", registerVo.getUserType()
				+ "");
		String result = ApiUtils.sendPost(app.getUrl()
				+ Constants.APP_REGISTER_URL, param, false);
		ResultLoginVo loginResult = JsonMapper.fromJson(result,
				ResultLoginVo.class);
		JsonResult jsonResult = ApiUtils.getJsonResult(loginResult);
		if (JsonResult.SUCCESS.equals(jsonResult.getCode())) {
			jsonResult.setMessage("账号注册成功");
		}else{
			if("nameexists".equalsIgnoreCase(loginResult.getStatus())){
				jsonResult.setMessage("用户名已被注册");
			}else if("phoneexists".equalsIgnoreCase(loginResult.getStatus())){
				jsonResult.setMessage("手机号已被注册");
			}
		}
		return jsonResult;
	}
    /**
     * 璺冲埌蹇樿瀵嗙爜鎵惧洖鐣岄潰
     *
     * @return
     */
    @RequestMapping("/forgetPwd")
    public String forgetPwd(){
        return "forgetPwd";
    }

    @RequestMapping("/loginSubmit")
    @ResponseBody
    public Object loginSubmit(LoginVo loginVo,  Model model,HttpServletRequest request) {
      String param = "";
      
      param = ApiUtils.addParam(param, "OPNO", loginVo.getUsername());
      param = ApiUtils.addParam(param, "PWD", loginVo.getPassword());
      param = ApiUtils.addParam(param, "REMEMBER", (loginVo.isRememberMe() != null && loginVo.isRememberMe())?"1":"0");
      
      String result = ApiUtils.sendPost(app.getUrl() + Constants.APP_LOGIN_URL, param, false);
      ResultLoginVo loginResult = JsonMapper.fromJson(result, ResultLoginVo.class);
      JsonResult jsonResult = ApiUtils.getJsonResult(loginResult);
      if(JsonResult.SUCCESS.equals(jsonResult.getCode())){
    	  UserUtils.addSessionAttribute(Constants.SESSION_INFO_KEY, loginVo);
      }
      return jsonResult;
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute(Constants.SESSION_INFO_KEY);

        return "redirect:/home/index";
    }

}
