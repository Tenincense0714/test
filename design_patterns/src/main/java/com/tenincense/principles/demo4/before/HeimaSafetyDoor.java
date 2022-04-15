package com.tenincense.principles.demo4.before;

/**
 * @version v1.0
 * @ClassName: HeimaSafetyDoor
 * @Description: 黑马品牌的安全门
 * @Author: TenIncense
 */
public class HeimaSafetyDoor implements SafetyDoor {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
