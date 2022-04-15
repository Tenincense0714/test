package com.tenincense.pattern.singleton.demo6;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试类
 * @Author: TenIncense
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1); //true

    }
}
