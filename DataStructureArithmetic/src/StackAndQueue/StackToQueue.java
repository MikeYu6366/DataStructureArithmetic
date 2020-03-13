package StackAndQueue;

import java.util.Stack;

/**
 * 两个栈模拟的队列机构
 */
public class StackToQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if(stack2.size()==0){
            while (!stack1.isEmpty()){
                int temp = stack1.peek();
                stack2.push(temp);
                stack1.pop();
            }
        }
        int res = stack2.peek();
        stack2.pop();
        return res;
    }

    public static void main(String[] args){
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.push(1);
        stackToQueue.push(2);
        stackToQueue.push(3);
        System.out.println(stackToQueue.pop());
        stackToQueue.push(4);
        stackToQueue.push(5);
        System.out.println(stackToQueue.pop());
        System.out.println(stackToQueue.pop());
        System.out.println(stackToQueue.pop());

        System.out.println(stackToQueue.pop());

    }

}
