package MultiThreading;

public class  MyThread_Implementation implements Runnable{
    @Override
  synchronized public void run(){
   for (int i=0;i<10;i++){
       System.out.print(i+" ");
      try {
          Thread.sleep(2000);
      }
      catch (Exception e){}
   }
   }

    public static void main(String[] args) {
        MyThread_Implementation t=new MyThread_Implementation();
        Thread thread=new Thread(t);
        thread.start();
        MyThread_Extands threadExtands=new MyThread_Extands();
        threadExtands.start();
    }
}
