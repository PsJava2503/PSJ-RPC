package com.psj.rpc.server;


import com.psj.rpc.api.HelloObject;
import com.psj.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Pishaojun
 *
 */

public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到消息：{}", object.getMessage());
        return "这是掉用的返回值，id=" + object.getId();
    }

}
