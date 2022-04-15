package com.tenincense.pattern.singleton.demo7;

import java.io.*;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试类
 *          测试使用反射破坏单例模式
 *
 *          文件路径: /Users/shixiang/Test/File
 * @Author: TenIncense
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //writeObjectToFile();
        readObjectFromFile(); //com.tenincense.pattern.singleton.demo7.Singleton@4dd8dc3
        readObjectFromFile(); //com.tenincense.pattern.singleton.demo7.Singleton@4dd8dc3
    }

    //从文件中读取数据(对象)
    public static void readObjectFromFile() throws Exception {
        //1. 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/shixiang/Test/File/a.txt"));
        //2. 读取对象
        Singleton instance = (Singleton) ois.readObject();

        System.out.println(instance);

        //3. 释放资源
        ois.close();
    }

    //向文件中写数据(对象)
    public static void writeObjectToFile() throws Exception {
        //1. 获取 Singleton 对象
        Singleton instance = Singleton.getInstance();
        //2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/shixiang/Test/File/a.txt"));
        //3. 写对象
        oos.writeObject(instance);
        //4. 释放资源
        oos.close();
    }
}
