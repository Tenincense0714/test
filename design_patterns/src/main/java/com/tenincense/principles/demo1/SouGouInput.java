package com.tenincense.principles.demo1;

/**
 * @version v1.0
 * @ClassName SouGouInput
 * @Description 搜狗输入法
 * @Author TenIncense
 */
public class SouGouInput {

    private AbstractSkin skin;

    //setter
    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    //显示皮肤方法
    public void display(){
        skin.display();
    }
}
