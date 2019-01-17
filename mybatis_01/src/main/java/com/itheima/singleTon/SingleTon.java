package com.itheima.singleTon;

/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2018/12/29 15:50
 * @Version: 1.0
 * 单例模式
 */
public class SingleTon {
   //私有构造器
    private SingleTon(){

    }
    //创建私有对象
    private static SingleTon  ton=new SingleTon();



   public SingleTon  getInstance(){
       return ton;
   }
}
