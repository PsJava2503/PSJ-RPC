package com.psj.rpc.provider;

/**
 *
 * @author Pishaojun
 *
 */

public interface ServiceProvider {

    <T> void register(T service);

    Object getService(String serviceName);

}
