import javax.rmi.CORBA.Util;

/**
 * Created by zhuoxiuwu on 2017/2/12.
 */
public class ShellSearch {
    public static void sort(double[] array) {
        int N = array.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
        while (h >= 1) { // 将数组变为h有序
            for (int i = h; i < N; i++) { // 将a[i]插入到a[i-h], a[i-2*h], a[i-3*h]... 之中
                for (int j = i; j >= h && SortUtils.less(array[j], array[j - h]); j -= h)
                    SortUtils.exch(array, j, j - h);
            }
            h = h / 3;
        }
    }
}
