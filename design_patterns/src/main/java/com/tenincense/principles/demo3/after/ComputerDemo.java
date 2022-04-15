package com.tenincense.principles.demo3.after;

/**
 * @version v1.0
 * @ClassName: ComputerDemo
 * @Description: 测试类
 * @Author: TenIncense
 */
public class ComputerDemo {
    public static void main(String[] args) {

        //创建计算机组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        //创建计算机对象
        Computer c = new Computer();
        //组装计算机
        c.setHardDisk(hardDisk);
        c.setCpu(cpu);
        c.setMemory(memory);

        //运行计算机
        c.run();

    }
}
