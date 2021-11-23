package com.psj.rpc.server;

import com.psj.rpc.api.ByeService;
import com.psj.rpc.api.HelloService;
import com.psj.rpc.provider.DefaultServiceProvider;
import com.psj.rpc.provider.ServiceProvider;

public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ByeService byeService = new ByeServiceImpl();
        ServiceProvider serviceProvider = new DefaultServiceProvider();
        serviceProvider.register(helloService);
        serviceProvider.register(byeService);
        RpcServer rpcServer = new RpcServer(serviceProvider);
        rpcServer.register(helloService, 9000);
    }

}
