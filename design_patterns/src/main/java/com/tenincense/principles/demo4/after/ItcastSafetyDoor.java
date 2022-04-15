package com.tenincense.principles.demo4.after;

/**
 * @version v1.0
 * @ClassName: ItcastSafetyDoor
 * @Description: 传智安全门类
 * @Author: TenIncense
 */
public class ItcastSafetyDoor implements AntiTheft,Fireproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }
}
