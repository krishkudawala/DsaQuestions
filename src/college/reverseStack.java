package college;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> orignal =new Stack<>();
        orignal.push(1);
        orignal.push(2);
        orignal.push(3);
        orignal.push(4);
        orignal.push(5);
        System.out.println(orignal  );
        Stack <Integer> reverse=new Stack<>();
        while (!orignal.isEmpty()){
            int ele=orignal.pop();
            reverse.push(ele);
        }
        System.out.println(reverse);
    }
}
