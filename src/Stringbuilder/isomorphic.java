package Stringbuilder;

public class isomorphic {
    public static void main(String[] args) {
        String s ="paper";
        String t ="title";
        char [] a=new char[128];
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            char dh=t.charAt(i);
            int idx=(int)ch;
            if (a[idx]=='\0') a[idx]=dh;
            else  if (a[idx]!='\0');
        }
        char [] b=new char[128];
        for (int i=0;i<s.length();i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int) ch;
            if (b[idx] == '\0') b[idx] = dh;
            else {
              if (a[idx] != '\0');
                return;
            }
        }
}

}

