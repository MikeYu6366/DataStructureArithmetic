package Array;

import java.util.Arrays;

public class ArrayReverse {
    /**
     * 数组逆序操作
     * @param array
     */
    public void reverse (int[] array){
        int i = 0;
        int j = array.length - 1;
        //[3]定义一个循环重复上述操作
        //直到ij相遇，或者j的取值小于i的为止
        while (i<j){  //结束条件是i>=j
            //[1]ij交换的操作
            int temp = array[i];
            array[i] = array[j];
            array[j]= temp;
            //[2]i向后走，j向前走
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,4,2,7,5,9,6};
        ArrayReverse ar = new ArrayReverse();
        ar.reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
