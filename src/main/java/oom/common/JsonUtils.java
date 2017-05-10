package oom.common;

import com.alibaba.fastjson.JSON;

/**
 * json工具类
 *
 * Created by Administrator on 2016/3/13.
 */
public class JsonUtils {

    /**
     * 对象转换成json字符串
     *
     * @param obj
     * @return
     */
    public static String toJson(Object obj){
        String jsonString = JSON.toJSONString(obj);
        return jsonString  == null ? "" :  jsonString;
    }
    

}
