package com.tenincense.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/**
 * @version v1.0
 * @ClassName: RuntimeDemo
 * @Description: 测试Runtime类
 * @Author: TenIncense
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //获取 Runtime 类的对象
        Runtime runtime = Runtime.getRuntime();

        //调用 runtime 的方法exec,参数要的是一个命令
        Process process = runtime.exec("ifconfig");
        //调用 process 对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        //读取数据
        int len = is.read(arr); //返回读到的字节的个数
        //将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr,0,len,"GBK"));
    }

}
