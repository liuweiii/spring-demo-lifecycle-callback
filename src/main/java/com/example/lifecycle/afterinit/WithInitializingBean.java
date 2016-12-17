package com.example.lifecycle.afterinit;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by apple on 2016/12/16.
 */
public class WithInitializingBean implements InitializingBean{

    public WithInitializingBean(){
        System.out.println("[InitializingBean][in]initialization");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("[InitializingBean][after]initialization");
    }
}
