package pratice;

import com.zous.SortUtils;

/**
 * Created by zhuoxiuwu on 2017/5/17.
 */

/**
 * 选择排序法的第一层循环从起始元素开始选到倒数第二个元素，
 * 主要是在每次进入的第二层循环之前，将外层循环的下标赋值给临时变量，接下来的第二层循环中
 * ，如果发现有比这个最小位置处的元素更小的元素，则将那个更小的元素的下标赋给临时变量，
 * 最后，在二层循环退出后，如果临时变量改变，则说明，有比当前外层循环位置更小的元素，需要将这两个元素交换.
 */
public class SelectionSearchPratice {
    public static void main(String[] args){
        double[] unSorted = SortUtils.unSorted.clone();
        int length = unSorted.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            double min = unSorted[minIndex];
            for (int j = i+1; j <length ; j++) {
                if (unSorted[j]<min){
                    min = unSorted[j];
                    minIndex = j;
//                    SortUtils.exch(unSorted,i,j); //warn 不要在这里做交换，等循环全部结束后，再做交换
                }
            }
            if (minIndex!=i){
                SortUtils.exch(unSorted,i,minIndex);
            }
        }
        SortUtils.isSorted(unSorted);
    }
}
