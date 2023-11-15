package stack;

import java.util.Queue;
import java.util.Stack;

public class QueueUsingStacks {
    static class Queue {
        Stack<Character> stack1;
        Stack<Character> stack2;
    }

    static void enqueue(Stack s, Character element){
        s.push(element);
    }



    static void dequeue(Queue q){
        while (!q.stack1.isEmpty()){
            q.stack2.push(q.stack1.pop());
        }
    }
    public static void queueUsingStack(){

       Queue q = new Queue();
       q.stack1 = new Stack<>();
       q.stack2 = new Stack<>();

       enqueue(q.stack1,'1');
       enqueue(q.stack1,'2');
       enqueue(q.stack1,'3');
       dequeue(q);

       while(!q.stack2.empty()){
           System.out.print(q.stack2.pop() + " ");
       }
    }
}

