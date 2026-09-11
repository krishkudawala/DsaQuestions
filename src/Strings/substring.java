package Strings;

public class substring {
    public static void main(String[] args) {
        String s ="abc";
        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<=3;j++){
                System.out.println(s.substring(i,j)+" ");

            }

        }
    }
}