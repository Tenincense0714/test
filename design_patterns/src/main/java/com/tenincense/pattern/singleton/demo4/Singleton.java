package com.tenincense.pattern.singleton.demo4;

/**
 * @version v1.0
 * @ClassName: Singleton
 * @Description: 双重检查锁方式
 * @Author: TenIncense
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    //声明 Singleton 类型的变量
    private static volatile Singleton instance;

    //对外提供公共的访问方式
    public static Singleton getInstance(){
        //第一次判断 ,如果 instance 的值不为 null ,不需要抢占锁,直接返回对象
        if (instance == null){
            synchronized (Singleton.class){
                //第二次判断
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
