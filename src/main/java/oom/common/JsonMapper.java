package oom.common;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * json工具类
 *
 * Created by huangjt on 2016/4/21.
 */
public class JsonMapper {
    private static ObjectMapper objectMapper = new ObjectMapper();
    static {
        objectMapper.configure(DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        //忽略未知字段
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * 转成json
     * @param obj
     * @return
     */
    public static String toJson(Object obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * json转对象
     *
     * @param json
     * @param cls
     * @return
     */
    public static <T> T fromJson(String json, Class<T> cls){
        try {
            return objectMapper.readValue(json,cls);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
