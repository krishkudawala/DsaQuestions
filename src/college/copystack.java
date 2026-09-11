package college;

import java.util.Stack;

public class copystack {
    public static void main(String[] args) {
        Stack<Integer> original= new Stack<>();
        original.push(1);
        original.push(2);
        original.push(3);
        original.push(4);
        original.push(5);
        int newele=10;
        int pos=2;
        System.out.println(original);
        Stack<Integer> temp=new Stack<>();
        while (!original.isEmpty()) {
            temp.push(original.pop());
        }
        System.out.println(temp);
            Stack<Integer> fina = new Stack<>();
        while (!temp.isEmpty()) {
            fina.push(temp.pop());
        };
        System.out.println(fina );
    }

}
