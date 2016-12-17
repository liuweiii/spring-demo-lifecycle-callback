package com.example.lifecycle;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by apple on 2016/12/16.
 */
public class WithXMLBean{

    public WithXMLBean(){
        System.out.println("[init][XML][in]");
    }

    public void afterInit(){
        System.out.println("[init][XML][after]");
    }

    public void afterDestroy(){
        System.out.println("[destroy][XML][after]");
    }
}
