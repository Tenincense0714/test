package com.tenincense.pattern.singleton.demo1;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试类
 * @Author: TenIncense
 */
public class Client {
    public static void main(String[] args) {
        //创建 Singleton 类的对象
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        //判断获取到的两个是否是同一个对象
        System.out.println(instance == instance1); //true
        System.out.println("git测试");
    }

}
