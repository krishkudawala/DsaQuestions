package college;

public class merdee {
    public static void main(String[] args) {
        int a []={1,3,5,7,9};
        int b[]={2,4,6,8,10};
        int c[]=new int[a.length+b.length];

        int i=0 , j=0 ,k=0;
        while (i<a.length&& j<b.length){
            if (a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while (j<b.length) c[k++]=a[j++];
        while (i<a.length) c[k++]=b[i++];

        for (int ele : c){
            System.out.print(ele+" ");
        }
    }
}
