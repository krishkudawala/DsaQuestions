package college;

public class poly {
    private String name;
    private int roll;

    public void setpoly(String s, int r){
        name=s;
        roll=r;
    }
    public void showpoly(){
        System.out.print(name+" ");
        System.out.print(roll+" ");
    }

    public static void main(String[] args) {
        poly poly=new poly();
        poly.setpoly("as",2);
        poly.showpoly();
    }
}
