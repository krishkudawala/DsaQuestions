package college;

public class taask extends Thread {
    @Override
  public void run(){
      for (int i=0;i<=10;i++){
          System.out.print(i+" ");
          try {
              Thread.sleep(1000);
          } catch (Exception e){}
      }
  }

    public static void main(String[] args) {
      taask t1=new taask();
      t1.start();
        

      taask t2=new taask();
      t2.start();

      taask t3=new taask();
      t3.start();

      taask t4=new taask();
      t4.start();
    }
}
