package Array;

import java.util.Arrays;

public class ArrayMerge {
    /**
     * 数组的有序合并
     */
    public int[] merge(int[] arr1 , int[] arr2){
        //[1]创建结果数组，长度是arr1.length 加上arr2.length；
        int[] result  = new int[arr1.length+arr2.length];
        //[2]定义3个变量ijk，i遍历arr1，j遍历arr2，k控制结果数组中下标的移动;
        int i = 0;
        int j = 0;
        int k = 0;
        //[5]创建一个循环控制下列步骤的重复
        while (i<arr1.length && j < arr2.length){//循环结束条件是： i == arr1.length ||  j = arr2.length ;
            //[3]比较arr1[i] 和arr2[j]的取值，谁小就将谁落在result[k]上
            if (arr1[i]<=arr2[j]){
                result[k] = arr1[i];
                //[4]哪一个数组中的元素落在结果数组中，对应的下标向前进一位
                i++;
            }else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        //[6]讲arr1 或者arr2 中剩余的元素拷贝到result 结果数组中
        if (i < arr1.length){//arr1 没跑完
            while (i<arr1.length){
                result[k++] = arr1[i++];
            }
        }
        if (j < arr2.length){//arr2 没跑完
            while (j<arr2.length){
                result[k++] = arr2[j++];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayMerge am = new ArrayMerge();
        int[] arr1 = new int[]{1,2,4,4,6,8,9};
        int[] arr2 = new int[]{0,1,3,6,7};
        int[] result = am.merge(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
}
