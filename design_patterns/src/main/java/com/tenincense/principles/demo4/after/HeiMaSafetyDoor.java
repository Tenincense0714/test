package com.tenincense.principles.demo4.after;

/**
 * @version v1.0
 * @ClassName: HeiMaSafetyDoor
 * @Description: 黑马安全门类
 * @Author: TenIncense
 */
public class HeiMaSafetyDoor implements AntiTheft,Fireproof,Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
