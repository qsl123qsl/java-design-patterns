package com.illuwater.serviceprovider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceProvider {
    private ServiceProvider(){}

    private static final Map<String,Provider> providers = new ConcurrentHashMap<String,Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "default_name";

    public static void registerProvider(String name,Provider p){
        providers.put(name,p);
    }

    public static void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME,p);
    }

    public static Service newInstance(String name){
        Provider p = providers.get(name);
        return p.newService();
    }

    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
}
