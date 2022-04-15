package com.tenincense.pattern.singleton.demo3;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试类
 * @Author: TenIncense
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        //判断两次获取到的 Singleton 对象是否同一个对象
        System.out.println(instance == instance1); //true

    }
}
