package oom.common;

import com.alibaba.fastjson.JSON;

/**
 * json 实体类
 * Created by Administrator on 2016/3/13.
 */
public class JsonResult {
    public static final Integer ERROR = -1;
    public static final Integer SUCCESS = 0;
    public static final String  ERROR_MSG = "操作失败";
    public static final String SUCCESS_MSG = "操作成功";

    private Integer code;
    private String message;
    private Object data;

    public JsonResult(){
        this.code  = JsonResult.ERROR;
        this.message = JsonResult.ERROR_MSG;
    }

    public JsonResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
