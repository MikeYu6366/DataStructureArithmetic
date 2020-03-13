package Arithmetic;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] array){
        for (int i = 0; i <array.length-1;i++){
            for (int j = 0; j<array.length-i-1;j++){
                if (array[j+1]<array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,4,6,74,43,55,23,56,8,99,0};
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
