package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 测试queue方法
 */
public class QueueMethodTest {

    public static void main(String[] args) {
         Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        //poll()获取队首元素并删除
        System.out.println("poll:"+queue.poll());
        System.out.println("poll:"+queue.poll());
        System.out.println("poll:"+queue.poll());
        System.out.println("poll:"+queue.poll());
        System.out.println("poll:"+queue.poll());
        System.out.println("---------------");
        //peek()获取队首元素不删除,如果没有元素输出null
        System.out.println("peek:"+queue.peek());
        System.out.println("peek:"+queue.peek());
        System.out.println("peek:"+queue.peek());
        System.out.println("peek:"+queue.peek());
        System.out.println("peek:"+queue.peek());
        System.out.println("---------------");
        //size()获取队列中元素个数
        System.out.println("size:"+queue.size());
        //element()队列为空的话会抛出NoSuchException异常
        System.out.println(queue.element());
    }

}
