package college;

import java.util.Stack;

    public class QueueUsingStack {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        public void enqueue(int x) {
            s1.push(x);
        }
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        public static void main(String[] args) {
            QueueUsingStack queue = new QueueUsingStack();

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            System.out.println("Front: " + queue.peek());  // 10
            System.out.println("Dequeue: " + queue.dequeue()); // 10
            System.out.println("Dequeue: " + queue.dequeue()); // 20
            queue.enqueue(40);
            System.out.println("Front: " + queue.peek());  // 30
            System.out.println("Dequeue: " + queue.dequeue()); // 30
            System.out.println("Dequeue: " + queue.dequeue()); // 40
            System.out.println("Empty: " + queue.isEmpty()); // true
        }
    }


