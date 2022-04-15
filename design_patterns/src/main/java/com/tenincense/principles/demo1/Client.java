package com.tenincense.principles.demo1;

/**
 * @version v1.0
 * @ClassName Client
 * @Description 测试显示皮肤功能的测试类
 * @Author TenIncense
 */
public class Client {
    public static void main(String[] args) {
        //1.创建搜狗输入法对象
        SouGouInput input = new SouGouInput();
        //2.创建皮肤对象
        //DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin = new HeimaSkin();
        //3.将皮肤设置到输入法中
        input.setSkin(skin);

        //4.显示皮肤
        input.display();
    }
}
