package com.kunyao.alogrithm.sort;

import java.util.Arrays;

/**
 * @author sky
 * @description 插入排序
 */
public class InsertSort {


    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr){
        for(int j = 1; j < arr.length; j++){
            //将数组的左边第一个元素当做有序列表
            //待插入的元素
            //j = 1, key = 2
            int key = arr[j];
            //待插入的位置
            //j = 1 , i = 0
            int i = j - 1;

            //1. i = 0 , arr[i] = 3, 3 > 2 => true
            //2. i = -1 => false
            while(i >= 0 && arr[i] > key){
                //a[1] = a[0] => a[1] = 3
                //将有序列表的容量加1
                arr[i + 1] = arr[i];
                //i = -1;
                i--;
            }
            //i + 1 = 0
            //j = 1
            //true
            if(i + 1 != j){
                //a[0] = 2
                arr[i + 1] = key;
            }
        }
    }
}
