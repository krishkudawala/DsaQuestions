package oops;

public class staticdemo {
    private int age;
    private String name;
  private static String company ="Amazon";

public staticdemo(int a ,String n) {
    age=a;
    name =n;
}
public void diplay() {System.out.println("age"+age+"name"+name+"company"+company);

}
public static void main(String[] args) {
        staticdemo s=new staticdemo(21,"krish");
        staticdemo s1=new staticdemo(22,"dsc");
s.diplay();

    }
}
