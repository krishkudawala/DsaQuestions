package oops;

public class student {
    private int roll;
  private   String name;
   private Double per;
   public void setstudent(int r ,String n,Double p){
       roll=r;
       name=n;
       per=p;

   }
   public  void shoestudent(){
       System.out.println("roll"+roll);
       System.out.println("name"+name);
       System.out.println("per"+per);
    }
}
