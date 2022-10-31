package com.annacode.note;

import java.util.Arrays;

public class Lesson5_SelectSort {
    public static void selectSort(int[] array){
        // 先想边界条件
        if (array == null || array.length < 2){
            return;
        }
        //
        int N = array.length;
        for (int i = 0 ; i < N; i++){
            int minValueIndex = i;
            for (int y = i+1 ; y < N ; y++){
                minValueIndex = array[y] < array[minValueIndex] ? y :minValueIndex;
            }
            swap(array,i,minValueIndex);
        }
    }
    public static void swap(int[] array, int i , int j){
        if (array[i] == array[j])
            return;
        // 位运算换位
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
        // 容器换位
//        int tmp = array[j];
//        array[j] = array[i];
//        array[i] = tmp;
    }
    public static void print(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] array = {7,543,23,5,3,23,45,4,5,76,6,32,23,9};
        print(array);
        selectSort(array);
        print(array);
    }
}
