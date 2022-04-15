package com.tenincense.principles.demo4.before;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试类
 * @Author: TenIncense
 */
public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
