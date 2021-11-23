package com.psj.rpc.api;

import java.io.Serializable;

/**
 *
 * @author Pishaojun
 *
 */

// 这个对象需要实现Serializable接口，因为它需要在调用过程中从客户端传递给服务端。
public class HelloObject implements Serializable {

    private Integer id;
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloObject(Integer id, String message) {
        this.id = id;
        this.message = message;
    }
}
