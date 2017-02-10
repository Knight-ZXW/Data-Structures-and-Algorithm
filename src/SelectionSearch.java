import java.util.Comparator;

/**
 * Created by zhuoxiuwu on 2017/2/9.
 * 选择排序
 */
public class SelectionSearch {
    public static void sort(int[] a){
        //将a 按照升序排列
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int minIdx = i;

            for (int j = i+1; j < N; j++) {

                if (SortUtils.less(a[j],a[minIdx])){
                    minIdx = j;
                }
            }
            SortUtils.exch(a,i,minIdx);
        }
        SortUtils.show(a);
    }

    public static void main(String[] args) {
        SortUtils.printDefaultArray();
        sort(SortUtils.unSorted);
        SortUtils.isSorted(SortUtils.unSorted);
    }
}
