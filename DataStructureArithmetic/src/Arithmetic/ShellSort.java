package Arithmetic;

import java.util.Arrays;

public class ShellSort {

    /**
     * 希尔排序
     *
     * @param array
     */
    public void shellSort(int[] array) {
        int step = array.length / 2;  //定义初始步长是数组长度的一半
        while (step > 0) {
            //使用一个循环，控制步长内的元素全部进行一次插值排序
            for (int start = 0; start < step; start++) {
                insertionSort(array, start, step);  //内部使用间隔为步长的插值排序算法
            }
            step /= 2;  //步长变成原来的一半
        }
    }

    /**
     * 希尔排序是一种基于插值排序的算法
     * 这个方法是希尔排序内部使用的一种带有步长，并指定比较起点的插值排序算法
     *
     * @param array 待排序数组
     * @param start 比较起点
     * @param step  步长
     */
    private void insertionSort(int[] array, int start, int step) {
        for (int i = start + step; i < array.length; i += step) {
            for (int j = i; j - step >= 0 && array[j] < array[j - step]; j -= step) {
                int tmp = array[j];
                array[j] = array[j - step];
                array[j - step] = tmp;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{7, 0, 1, 9, 2, 6, 3, 8, 5, 4};

        ShellSort ss = new ShellSort();
        ss.shellSort(array);

        System.out.println(Arrays.toString(array));

    }
}