package oops;

 class demo {
      private int age;
    private String name;
    private static String company = "Amazon";

     public demo(int a ,String n) {
         age=a;
         name=n;
     }public void display(){
         System.out.println("age"+age+" name"+name+" company"+company);
     }

     public static void main(String[] args) {
         demo e = new demo(21,"deepak");
         demo d = new demo(22,"anil");
         demo f = new demo(23,"sonam");
         e.display();

     }
}
