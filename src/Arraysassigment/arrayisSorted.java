package Arraysassigment;

public class arrayisSorted {
    public static void main(String[] args) {
      int []arr={1,2,3,4,5,6,5};
      int n=arr.length;
      boolean flag=true;
      for (int i=0;i<n-1;i++){
          if (arr[i]>arr[i+1]) {
              flag=false;
              break;
          }
      }
      if (flag==true) System.out.println("Souted");
      else System.out.println("Not sroted");
    }
}

