package com.tenincense.principles.demo4.after;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: TenIncense
 */
public class Client {
    public static void main(String[] args) {
        //创建黑马安全门对象
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("===========================");

        //创建传智安全门对象
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        door1.antiTheft();
        door1.fireproof();
    }
}
