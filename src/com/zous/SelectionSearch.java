package com.zous;

/**
 * Created by zhuoxiuwu on 2017/2/9.
 * 选择排序
 */
public class SelectionSearch {
    public static void sort(double[] a){
        //将a 按照升序排列
        //每次排列都找出一个最小值，
        double[] cloneArray = a.clone();
        int N = cloneArray.length;
        for (int i = 0; i < N; i++) {
            int minIdx = i;

            for (int j = i+1; j < N; j++) {

                if (SortUtils.less(cloneArray[j],cloneArray[minIdx])){
                    minIdx = j;
                }
            }
            SortUtils.exch(cloneArray,i,minIdx);
        }
    }

    public static void main(String[] args) {
        SortUtils.printDefaultArray();
        sort(SortUtils.unSorted);
        SortUtils.isSorted(SortUtils.unSorted);
    }
}
