package college;

public class bubblesort {
    public static void print(int []arr){
        for (int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {67,44,82,17,20};
        int n =arr.length;
      for (int x=1;x<n-1;x++){
          boolean flag=true;
          for (int i=0;i<n-x;i++){
              if (arr[i]>arr[i+1]){
                  flag=true;
              }
          }
          if (flag==true){
              break;
          }
      }
      print(arr);
        }
    }
