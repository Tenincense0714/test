package com.tenincense.principles.demo2.after;

/**
 * @version v1.0
 * @ClassName: RectangleDemo
 * @Description: 测试类
 * @Author: TenIncense
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        //调用方法进行扩宽操作
        resize(r);

        printLengthAndWidth(r);
    }

    //扩宽的方法
    public static void resize(Rectangle rectangle){
        //判断宽如果比长小,进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println("长:" + quadrilateral.getLength());
        System.out.println("宽:" + quadrilateral.getWidth());
    }
}
