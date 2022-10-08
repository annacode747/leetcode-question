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
        printf(a);print(a);
        printf(~a);print(~a);      // 取反
        printf(-a);print(-a);       // 首先改变符号位 然后  a 的 反码 【取反 加 1】
        printf(~a+1);print(~a+1);      // 取反 + 1 等于改变符号位

        int b = 998798;
        System.out.println("===============================");
        printf(a);;print(a);
        printf(b);print(b);
        printf(a | b);print(a | b);     // 或运算 | 两个二进制只要是相同位数只要有一个1 那么计算后就哪一位就等于 1

        System.out.println("===============================");
        printf(a & b);print(a & b);     // 且运算 & 相同位置 两个数都是1 计算后该位置都等于 1
        System.out.println("===============================");
        printf(a ^ b);print(a ^ b);     // 异或运算 & 相同位置 相同为0 不同为1

        System.out.println("===============================");
        int c = 1024;
        printf(c);print(c);
        printf(c >> 1);print(c >> 1);      // 不 带符号右边移动
        System.out.println("===============================");
        printf(Integer.MIN_VALUE);print(Integer.MIN_VALUE);
        printf(Integer.MIN_VALUE >> 1);print(Integer.MIN_VALUE >> 1);       // 不 带符号右移 符号位会移动 左边补齐符号位
        printf(Integer.MIN_VALUE >>> 1);print(Integer.MIN_VALUE >>> 1);     // 带符号 右移 补0

        System.out.println("相反数 ： 取反 + 1 不是相反数的特例 是负数的绝对值的最大值 ，取反 + 1 后还是他自己：如下");
        printf(Integer.MIN_VALUE);print(Integer.MIN_VALUE);
        printf(~Integer.MIN_VALUE + 1);print(~Integer.MIN_VALUE + 1);
        printf(0);print(0);
        printf(~0 + 1);print(~0 + 1);
    }
}
