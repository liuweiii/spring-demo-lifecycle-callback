package com.example.lifecycle;

/**
 * Created by apple on 2016/12/17.
 */
public class WithDefaultBean {
    public WithDefaultBean(){
        System.out.println("[init][default][in]");
    }

    public void myInit(){
        System.out.println("[init][default][after]");
    }

    public void myDestroy(){
        System.out.println("[destroy][default][destroy]");
    }
}
