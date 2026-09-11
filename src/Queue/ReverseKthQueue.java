package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKthQueue {

    public Queue<Integer> modify(Queue<Integer> q, int k) {

        if (q == null || k <= 0 || k > q.size()) {
            return q;
        }

        Stack<Integer> st = new Stack<>();
        int n = q.size();

        // Step 1: Remove first k elements and push into stack
        while (k > 0) {
            st.push(q.poll());
            k--;
        }

        // Step 2: Push stack elements back into queue (reversed order)
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move remaining elements to back
        for (int i = 0; i < n - st.size(); i++) {
            q.add(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        ReverseKthQueue reverseKthQueue = new ReverseKthQueue();

        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);

        Queue<Integer> newq = reverseKthQueue.modify(que, 3);
        System.out.println(newq);
    }
}
