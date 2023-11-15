package stack;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStackUsingQueue {

    public static void reverseStackUsingQueue(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i=0;i<length;i++){
            stack.push(scanner.next());
        }
        while(!stack.empty()){
            queue.add(stack.pop());
        }

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
