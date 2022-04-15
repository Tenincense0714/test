package com.tenincense.principles.demo2.after;

/**
 * @version v1.0
 * @ClassName: Square
 * @Description: 正方形
 * @Author: TenIncense
 */
public class Square implements Quadrilateral{

    //边长
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
