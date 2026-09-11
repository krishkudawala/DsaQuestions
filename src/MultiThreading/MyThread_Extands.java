package MultiThreading;

public class MyThread_Extands extends Thread{
  synchronized   public void run(){
        for (int i=0;i<10;i++){
            System.out.print(i+" ");
            try {
                Thread.sleep(2000);
            } catch (Exception e){}
        }
    }
}
