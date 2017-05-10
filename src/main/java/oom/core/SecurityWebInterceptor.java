package oom.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oom.common.Constants;
import oom.common.WebUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * 权限校验拦截器 
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午10:25:00
 * @版本: V1.0
 *
 */
public class SecurityWebInterceptor extends HandlerInterceptorAdapter {

	private static Logger logger = LoggerFactory.getLogger(SecurityWebInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		/*String requestUri = request.getRequestURI();
		for(String url : excludedUrls){
			if(requestUri.endsWith(url)){
				return true;
			}
		}*/
		
		HttpSession session = request.getSession();
		if(session.getAttribute(Constants.SESSION_INFO_KEY) == null){
			String contextPath = request.getContextPath();
			String redirectUrl = contextPath + Constants.SESSION_REDIRECT_URL;
			//被拦截，重定向到login界面
            response.sendRedirect(redirectUrl);
			return false;
		}
		
		return true;
		
	}
	

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		String clientIp = WebUtils.getClientIpAddr(request);
		if(ex != null){
			logger.info(">>>>IP:"+clientIp + " web登陆异常，【{}】",ex);
		}
		
	}

}
