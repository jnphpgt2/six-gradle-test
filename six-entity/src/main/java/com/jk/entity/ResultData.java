package com.jk.entity;

import javax.json.Json;
import java.io.Serializable;

/**
 * Created by Janan on 2017/5/27.
 */
public class ResultData implements Serializable{
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
