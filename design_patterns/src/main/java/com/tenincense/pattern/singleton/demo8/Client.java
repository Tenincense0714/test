package com.tenincense.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description:
 *        测试使用反射破坏单例模式
 * @Author: TenIncense
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1. 获取 Singleton 的字节码对象
        Class<Singleton> clazz = Singleton.class;
        //2. 获取无参构造方法对象
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        //3. 取消访问检查(打破封装)
        cons.setAccessible(true);
        //4. 创建Singleton对象
        Singleton s1 = (Singleton)cons.newInstance();
        Singleton s2 = (Singleton)cons.newInstance();

        //如果返回的是 true,说明并没有破坏单例模式,如果是 false,说明破坏了单例模式
        System.out.println(s1 == s2);
    }
}
