package Arithmetic;

import java.util.Arrays;

public class SelectionSort {
    public void selectsort(int[] array){
        for (int i = 0;i<array.length-1;i++){
            int min = i;
            for (int j = i+1;j<array.length;j++){
                if (array[j]<array[min]){
                    min = j;
                }
            }
            if (i!=min){
                int temp = array[i];
                array[i]=array[min];
                array[min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,42,32,6,74,43,55,23,56,-8,99,0};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectsort(array);
        System.out.println(Arrays.toString(array));
    }
}
