import edu.princeton.cs.algs4.StdOut;

import javax.sound.midi.Soundbank;

/**
 * Created by zhuoxiuwu on 2017/2/10.
 */
public class InsertionSearch {
    /**
     * 插入排序的运行时间是线性的，每次循环 它都会到左边已经排序好的数组序列中去查找它合适的位置，左侧总是有序的，所以到末端时就排序好了
     * @param a
     * 步骤：
     * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 将新元素插入到该位置中
     * 重复步骤2
     */

    //该算法对非随机形算法很有效，比如接近排序好的数组
    public static void sort(double[] a){//1 4 2
        double[] cloneArray = a.clone();
        int N = cloneArray.length;
        double target;
        int j;
        for (int i = 1; i < N; i++) {
            j = i;
            target = cloneArray[i];
            while (j >0 && target<cloneArray[j-1]){
                cloneArray[j] = cloneArray[j-1];
                j--;
            }
            cloneArray[j] = target;
        }
    }

    public static void main(String[] args) {
        SortUtils.printDefaultArray();
        sort(SortUtils.unSorted);
        SortUtils.isSorted(SortUtils.unSorted);
    }
}
