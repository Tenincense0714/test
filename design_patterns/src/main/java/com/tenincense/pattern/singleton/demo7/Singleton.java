package com.tenincense.pattern.singleton.demo7;

import java.io.Serializable;

/**
 * @version v1.0
 * @ClassName: Singleton
 * @Description: 懒汉式 : 静态内部类方式
 * @Author: TenIncense
 */
public class Singleton implements Serializable {

    private static final long serialVersionUID = -828899860348748658L;

    //私有构造方法
    private Singleton(){}

    //定义一个静态内部类
    private static class SingletonHolder{
        //在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供公共的访问方式
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    //当进行反序列化时,会自动调用该方法,将该方法的返回值直接返回
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
