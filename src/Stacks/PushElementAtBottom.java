package Stacks;

import java.util.Stack;

public class PushElementAtBottom {
    public static void main(String[] args) {
        Stack <Integer> original=new Stack<>();
        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);

        int newelement=50;
        Stack <Integer> temp=new Stack<>();
        while (original.size()>0){
            temp.push(original.pop());
        }
        original.push(newelement);
        while (temp.size()>0){
             original.push(temp.pop());
        }
        System.out.println(original);
    }
}
