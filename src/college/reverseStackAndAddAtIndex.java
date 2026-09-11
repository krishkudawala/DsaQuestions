package college;

import java.util.Stack;

public class reverseStackAndAddAtIndex {
    public static void main(String[] args) {
        Stack<Integer> original=new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        original.push(5);

        int newele=10;
        int pos=2;

        Stack<Integer> reversed=new Stack<>();
        while (!original.isEmpty()){
            reversed.push(original.pop());
        }
        Stack<Integer> temp=new Stack<>();
        while (reversed.size()>pos){
            temp.push(reversed.pop());
        }
        reversed.push(newele);
        while (!temp.isEmpty()){
            reversed.push(temp.pop());
        }
        System.out.println(reversed);
    }
}
