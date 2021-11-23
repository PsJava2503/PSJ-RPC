package com.psj.rpc.server;


import com.psj.rpc.api.ByeService;

public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
