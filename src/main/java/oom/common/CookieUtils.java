package oom.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * cookie宸ュ叿绫�
 *
 * Created by Administrator on 2016/3/13.
 */
public class CookieUtils {

    /**
     * 瀵硅薄杞崲鎴恓son瀛楃涓�
     *
     * @return
     */
   /* public static CartVo getCookie(HttpServletRequest request, String cookieName){
       Cookie[] cookies = request.getCookies();
       for(int i=0;i<cookies.length;i++){
           Cookie cookie = cookies[i];
           if(cookie.getName().equals(cookieName)){
               String cookieValue = cookie.getValue();
               String[] arr = cookieValue.split("|$|");
               CartVo cart =new CartVo();
               cart.setCount(arr.length);
               List<ItemVo> list = new ArrayList<ItemVo>();

               for (int j = 0; j < arr.length; j++) {
                   ItemVo vo = new ItemVo();
                   String[] itemStr = arr[j].split("||");
                   vo.setId(Integer.valueOf(itemStr[0]));
                   vo.setName(itemStr[1]);
                   vo.setCount(Integer.valueOf(itemStr[2]));
                   vo.setPrice(Float.valueOf(itemStr[3]));
                   list.add(vo);
               }
               cart.setItems(list);
               return cart;
           }
       }

        return null;
    }
*/
    /**
     * 娣诲姞Cookie
     *
     * @param response
     * @param name
     *            Cookie鐨勫悕瀛�
     * @param value
     *            Cookie鐨勫�
     * @param maxAge
     *            Cookie鐨勫瓨娲绘椂闂�
     */
    public static void addCookie(HttpServletResponse response, String name,
                                 String value, int maxAge) {
        Cookie cookie = new Cookie(name, value);
        if (maxAge > 0)
            cookie.setMaxAge(maxAge);
        // 娣诲姞鍒板鎴风
        response.addCookie(cookie);
    }


    /**
     * 鍙栧嚭纭洏涓墍鏈夌殑Cookie
     *
     * @param request
     * @return
     */
    public static Map<String, Cookie> getAllCookies(HttpServletRequest request) {
        Map<String, Cookie> cookie_map = new HashMap<String, Cookie>();
        Cookie[] cookies = request.getCookies();
        //濡傛灉瀛樺湪cookie,灏卞瓨鍏ap
        if(cookies!=null){
            for (int i = 0; i < cookies.length; i++) {
                cookie_map.put(cookies[i].getName(), cookies[i]);
            }
        }
        return cookie_map;
    }
    /**
     * 鍦–ookie涓�杩嘋ookie鍚嶇О鑾峰緱Session涓殑SessionId
     * @param request
     * @param name
     * @return
     */
    public static String getSessionIdByNameInCookie(HttpServletRequest request,String name){
        Map<String, Cookie> cookie_map=getAllCookies(request);
        if(cookie_map.containsKey(name)){
            Cookie cookie = cookie_map.get(name);
            return cookie.getValue();
        }
        return null;
    }

}
