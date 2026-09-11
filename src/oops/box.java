package oops;

public class box {
    private int length , breath , height;
    public box(int length , int breath , int height){
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    public box(int side){
        this(side,side,side);
    }
    public box(){
        this(0,0,0);
    }
    public void show(){
        System.out.println("length"+length+"breath"+breath+"height"+height);
    }

}
