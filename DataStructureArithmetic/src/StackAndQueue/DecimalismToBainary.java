package StackAndQueue;

import java.util.Stack;

/**
 * 使用栈求得一个十进制数的二进制数
 */
public class DecimalismToBainary {
    public String toBinary(int num){
        //[1]创建一个栈对象
        Stack<Integer> s = new Stack<>();

        //[2]对num不断进行对2取余操作，将余数加入栈结构，什么时候num取值为0了，循环结束
        while (num>0){

            //取余数
            int remainder = num%2;
            //余数入栈
            s.push(remainder);
            //num变为原来的1/2
            num/=2;
        }

        //[3]将余数出栈（倒排余数过程）
        String result = "";
        while (!s.isEmpty()){
            result+=s.pop();
        }
        return result;
    }


    public static void main(String[] args) {
        int num = 26;
        DecimalismToBainary tb = new DecimalismToBainary();
        System.out.println(tb.toBinary(num));
    }
}
