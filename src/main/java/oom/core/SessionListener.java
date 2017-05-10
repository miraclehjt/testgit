package oom.core;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import oom.common.UserUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/3/25.
 */
public class SessionListener implements HttpSessionListener {
    public static Map<String,HttpSession> sessionMap = new HashMap<String,HttpSession>();

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        String sessionId = httpSessionEvent.getSession().getId();
        System.out.println("session created is:"+sessionId);
        sessionMap.put(sessionId,httpSessionEvent.getSession());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        sessionMap.remove(httpSessionEvent.getSession().getId());
    }

    /**
     * 获得session
     * @param session_id
     * @return
     */
    public static HttpSession getSessionById(String session_id){
        return sessionMap.get(session_id);
    }

    /**
     * 移除session
     * @param session_id
     */
    public static void removeSessionById(String session_id){
        sessionMap.remove(session_id);
    }
}
