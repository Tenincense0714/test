package com.tenincense.principles.demo3.after;

/**
 * @version v1.0
 * @ClassName: KingstonMemory
 * @Description: 金士顿内存条类
 * @Author: TenIncense
 */
public class KingstonMemory implements Memory{

    @Override
    public void save(){
        System.out.println("使用金士顿内存条");
    }
}
