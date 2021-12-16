package Dz2;

import java.util.Date;

public class Circle extends Shape {
    private Date PlDate;
    public Circle(int x, int y) {
        super(x,y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PlDate=" + PlDate +
                '}';
    }
    @Override
    public String getType() {
        return "This is Circle";
    }
    public double getArea() {
        PlDate = new Date();
        double s = Math.PI * Math.pow(getY(),2);
        return s;
    }
}