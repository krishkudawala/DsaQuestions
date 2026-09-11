package LinkedList;

//public class thread implements Runnable{
//    public void run(){
//        for (int i=0;i<10;i++){
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e){}
//        }
//    }
//
//    public static void main(String[] args) {
//        thread t=new thread();
//        Thread thread=new Thread(t);
//        thread.run();
//    }
//}
public class thread extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e ){}
        }
    }

    public static void main(String[] args) {
        thread thread=new thread();
        thread.run();
    }
}