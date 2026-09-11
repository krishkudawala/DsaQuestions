package college;

import java.util.Stack;

public class pusgbottom {
    public static void main(String[] args) {
        Stack<Integer> original=new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        original.push(5);

        int newele=10;
        int pos=2;
        System.out.println(original);
        Stack<Integer> temp=new Stack<>();
        while (original.size()>pos){
            temp.push(original.pop());
        }
        original.push(newele);
        while (!temp.isEmpty()){
            original.push(temp.pop());
        }
        System.out.println(original);
    }
}
