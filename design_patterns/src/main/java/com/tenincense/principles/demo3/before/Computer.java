package com.tenincense.principles.demo3.before;

/**
 * @version v1.0
 * @ClassName: Computer
 * @Description: 电脑类
 * @Author: TenIncense
 */
public class Computer {
    private XiJieHardDisk hardDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    //运行计算机的方法
    public void run(){
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是" + data);
        cpu.run();
        memory.save();
    }
}
