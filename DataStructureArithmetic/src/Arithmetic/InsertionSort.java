package Arithmetic;

import java.util.Arrays;

public class InsertionSort {

    /**
     * 插值排序
     *
     * @param array
     */
    public void insertionSort(int[] array) {
        //[1]使用外层排序控制从“牌堆”中抽取的“手牌”
        for (int i = 1; i < array.length; i++) {  //手牌从数组中的第2个元素开始抽，也就是下标为1的元素开始，下标为0的元素当做已有手牌
            //[2]使用内层循环控制抽到的牌和手牌之间的比较和排序，只要手牌更小，就一直向前交换，直到找到合适位置，或者数组到头为止
            for (int j = i; j - 1 >= 0 && array[j] < array[j - 1]; j--) {
                //[3]直接进行交换，因为比较的步骤已经定义在循环条件中了
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{-7, 0, 1, 9, 2, -6, 3, 8, 5, 4};
        InsertionSort is = new InsertionSort();
        is.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}