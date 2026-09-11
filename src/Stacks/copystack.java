package Stacks;

import java.util.Stack;

public class copystack {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        original.push(5);
        //System.out.println(original);
        Stack<Integer> temp = new Stack<>();
        while (!original.isEmpty()) {
            temp.push(original.pop());
        }
        //  System.out.println(temp);
        Stack<Integer> Final = new Stack<>();
        while (!temp.isEmpty()) {
            Final.push(temp.pop());
        }
        //  System.out.println(Final);
        while(!Final.isEmpty()) {
            System.out.print(Final.pop()+ " ");
        }

    }
}
