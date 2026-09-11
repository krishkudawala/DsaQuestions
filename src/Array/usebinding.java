package Array;

public class usebinding {
    public static void main(String[] args) {
        bindingparent p =new bindingparent();
        p.display();
       // p.show;
        p=new bindingchild();
        p.display();
    }
}
