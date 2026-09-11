package Array;

public class comppolyshap {
    public void area(double radius){
        double ar=Math.PI*Math.pow(radius,2);
        System.out.println("area of circle"+ar);
    }
    public void area(int side){
        int ar=side*side;
        System.out.println("Area of a square"+side);
    }
    public void area(int len , int breath){
        int ar=len+breath;
        System.out.println("Area of a rectangle"+ar);
    }
    }

