package com.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * Created by apple on 2016/12/16.
 */
public class WithJavaInterface implements InitializingBean, DisposableBean{

    public WithJavaInterface(){
        System.out.println("[init][java][in]");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("[init][java][after]");
    }

    @Override
    public void destroy(){
        System.out.println("[destroy][java][destroy]");
    }
}
