package Array;

import java.util.Arrays;
import java.util.Stack;

/**
 * 练习一
 * 通过栈实现数组逆序
 */
public class ArrayReverseByStack {
    public void reverse(int[] array){
        Stack<Integer> s = new Stack<>();
        for(int i : array){
            s.push(i);
        }

        int k = 0 ;
        while (!s.isEmpty()){
            array[k++]= s.pop();
        }
    }

    public static void main(String[] args) {
        int[] ar = new int[]{1,2,3,4,5};
        ArrayReverseByStack te = new ArrayReverseByStack();
        te.reverse(ar);
        System.out.println(Arrays.toString(ar));
    }
}
