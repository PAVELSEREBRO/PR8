package Dz2;

import java.util.Date;

public class Rectangle extends Shape {
    private Date AreaDate;
    private Date PerimeterDate;
    public Rectangle(int x, int y) {
        super(x,y);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "AreaDate=" + AreaDate +
                '}';
    }
    @Override
    public String getType() {
        return "This is Rectangle";
    }
    public double getPerimeter() {
        AreaDate = new Date();
        double p = (getX()+getY())*2;
        return p;
    }
}