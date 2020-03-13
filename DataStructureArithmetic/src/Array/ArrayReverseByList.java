package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 练习三
 * 使用list实现数组逆序
 */
public class ArrayReverseByList {
    public List<Integer> reverse(int[] array){
        List<Integer> list = new ArrayList<Integer>() ;
        int i = array.length-1 ;
        while (i>=0){
            list.add(array[i]);
            i--;
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayReverseByList ts = new ArrayReverseByList();
        int[] array = new int[]{1,2,3,4,5};
        System.out.println( ts.reverse(array));
    }
}
