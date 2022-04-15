package com.tenincense.principles.demo3.after;

/**
 * @version v1.0
 * @ClassName: IntelCpu
 * @Description: Intel cpu
 * @Author: TenIncense
 */
public class IntelCpu implements Cpu{
    @Override
    public void run(){
        System.out.println("使用Intel处理器");
    }
}
