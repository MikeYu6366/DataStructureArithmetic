package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

/**
 * 通过栈结构实现数组逆序
 */
public class ArrayReverse {
    public void reverse (int[] array){
        //[1]我们需要一个栈对象
        Stack<Integer> s = new Stack<>();
        //[2]将数组中所有元素入栈
        for (int i : array){
            s.push(i);
        }
        //[3]元素出栈,然后存储在array中
        int k = 0;//用来维护出栈元素在array数组中的下标
        while (!s.isEmpty()){
            array[k++] = s.pop();
        }
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5,6};
        ArrayReverse ar = new ArrayReverse();
        ar.reverse(array1);
        System.out.println(Arrays.toString(array1));
    }
}
