package oom.common;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/3/23.
 */
public class UserUtils {

    /**
     * 获取当前登录用户信息
     * @return
     */
    public static CurrentUserInfo getCurrentUser(){
        HttpSession session = getSession();
        CurrentUserInfo current = (CurrentUserInfo) session.getAttribute(Constants.SESSION_INFO_KEY);
        return current;
    }

    /**
     * 获取当前session信息
     * @return
     */
    public static HttpSession getSession(){
        HttpServletRequest request = getRequest();
        return request.getSession();
    }
    /**
     * 获取request
     * @return
     */
    public static HttpServletRequest getRequest() {
        return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
    }
    
    public static void addSessionAttribute(String key, Object name){
    	getSession().setAttribute(key, name);
    }
}
