package Array;

import java.util.Arrays;

/**
 * 练习二
 * 不使用新数组的情况下实现数组逆序
 */
public class ArrayReverseWithoutNewArray {
    public void  reverse ( int[] array){
        int i = 0 ;
        int j = array.length-1;
        while (i<=j){
            int temp;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayReverseWithoutNewArray te = new ArrayReverseWithoutNewArray();
        int[] ar = new int[]{1,2,3,4,5};
        te.reverse(ar);
        System.out.println(Arrays.toString(ar));
    }
}
