package com.wss.blog.VO;

import lombok.Data;

/**
 * @author xiaobiaodi
 * @create 2018-06-07 22:48
 **/
@Data
public class Response {
    private boolean success;   //处理是否成功
    private String message;     //处理返回的数据
    private Object body;        //返回的数据

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Response(boolean success, String message, Object body) {
        this.success = success;
        this.message = message;
        this.body = body;
    }
}
