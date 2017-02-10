import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by zhuoxiuwu on 2017/2/9.
 */
public class SortUtils {
    public static final int INTSIZE = 5;
    public static int[] unSorted = new int[INTSIZE];

    static {
        Random random = new Random();
        for (int i = 0; i < INTSIZE; i++) {
            unSorted[i] = random.nextInt(INTSIZE);
        }
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean less(Comparable i, Comparable j) {
        return i.compareTo(j) < 0;
    }

    public static boolean less(int i, int j) {
        return i < j;
    }

    public static void show(int[] t) {
        for (int i = 0; i < t.length; i++) {
            StdOut.print(t[i] + " ");
        }
        StdOut.println();
    }

    public static void show(Comparable[] t) {
        for (int i = 0; i < t.length; i++) {
            StdOut.print(t[i] + " ");
        }
        StdOut.println();
    }

    /**
     * 测试数组是否从小到大排序好
     *
     * @param a 待验证的数组
     * @return 是否排序好
     */
    public static boolean isSorted(Comparable[] a) {
        //测试数组是否已经排序
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }
    public static void printDefaultArray(){
        printArray(unSorted);
    }
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.print("\n");

    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {

            if (less(a[i], a[i - 1])) {
                StdOut.print("未排序好");
                printArray(a);
                return false;
            }
        }
        StdOut.print("已经排序好了");
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        return true;
    }
}

