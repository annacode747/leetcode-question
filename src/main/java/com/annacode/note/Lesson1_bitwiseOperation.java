package com.annacode.note;

/**
 * 第一节课，位运算
 */
public class Lesson1_bitwiseOperation {
    /**
     * 输出该数字的32位
     * @param num int
     */
    public static void print(int num){
        for (int i = 31 ; i >= 0 ; i--){
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
    public static void printf(int num){
        System.out.printf("%d\t",num);
    }
    public static void main(String[] args) {
        printf(8);
        print(8);   // 输出8的二进制
        printf(Integer.MAX_VALUE);
        print(Integer.MAX_VALUE);   // 输出int类型最大数的二进制
        printf(Integer.MIN_VALUE);
        print(Integer.MIN_VALUE);   // 输出int类型最小数的二进制
        int a = 54345;
        System.out.println("查看 a："+a+"\t");
        printf(a);;print(a);
        printf(-a);print(-a);       // 首先改变符号位 然后  a 的 反码 【取反 加 1】



    }
}
