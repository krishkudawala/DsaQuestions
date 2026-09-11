package OOPSP;

public class oops {
    public static void main(String[] args) {
        pen p=new pen();
        p.setcolour("blue");
        System.out.println(p.colur);
        p.setcolour("black");
        System.out.println(p.colur);
    }
}
class pen{
    String colur;
    int tip;

    void setcolour(String newcolour){
        colur=newcolour;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
