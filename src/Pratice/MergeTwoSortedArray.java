package Pratice;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] a={10,30,50,70,90};
        int [] b={20,40,60,80,99};
        int [] c=new int[a.length+b.length];
        int i=0 , j=0 , k=0;
        while (i<a.length && j<b.length){
            if (a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while (j<b.length) c[k++]=b[j++];
        while (i<a.length) c[k++]=a[i++];
        for(int ele : c){
            System.out.println(ele);
        }
        }
    }

