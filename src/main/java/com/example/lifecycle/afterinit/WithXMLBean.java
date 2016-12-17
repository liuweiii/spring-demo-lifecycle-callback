package com.example.lifecycle.afterinit;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by apple on 2016/12/16.
 */
public class WithXMLBean{

    public WithXMLBean(){
        System.out.println("[XML][in]initialization");
    }

    public void afterInit(){
        System.out.println("[XML][after]initialization");
    }

}
