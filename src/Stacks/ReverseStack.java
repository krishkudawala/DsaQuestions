package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> original =new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        original.push(5);
        System.out.println(original);


        Stack <Integer> reverse=new Stack<>();

        while (!original.isEmpty()){
//            int element= original.pop();
//            reverse.push(element);

            reverse.push(original.pop());
        }
//        System.out.println(original);
    }
}
