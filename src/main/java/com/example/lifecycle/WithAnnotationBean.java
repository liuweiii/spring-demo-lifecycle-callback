package com.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by apple on 2016/12/16.
 */
public class WithAnnotationBean {

    public WithAnnotationBean(){
        System.out.println("[init][annotation][in]");
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("[init][annotation][after]");
    }

    @PreDestroy
    public void afterDestroy(){
        System.out.println("[destroy][annotation][after]");
    }
}
