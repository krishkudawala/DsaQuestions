package college;

import java.util.Scanner;

public class findduplicate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter aray size: ");
        int a = sc.nextInt();
        int [] arr=new int[a];
        int n= arr.length;
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for (int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                   break;
                }
            }
        }
            if (flag==true) System.out.println("Found");
            else System.out.println("not found");

        }
    }

