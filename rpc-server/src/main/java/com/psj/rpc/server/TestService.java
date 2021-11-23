package com.psj.rpc.server;

import com.psj.rpc.api.HelloService;

public class TestService {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService, 9000);
    }

}
