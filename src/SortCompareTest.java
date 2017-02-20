import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by zhuoxiuwu on 2017/2/11.
 */
public class SortCompareTest {
    /**
     * 该了用来比较算法
     * 在数组随机且不重复的情况下，插入排序 基本上会比选择排序快上1倍
     */

    public static double timeRandomInput(Class clazz,int N,int T){
        //使用算法1将T个长度为N 的数组排序
        double total = 0.0;
        double[] a = new double[N];
        for (int t = 0; t < T; t++) {
            //进行一次测试 （生成一个数组并排序）
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(clazz,a);
        }
        return total;
    }

    public static double time(Class alg, double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg == InsertionSearch.class) InsertionSearch.sort(a);
        else if (alg == SelectionSearch.class) SelectionSearch.sort(a);
        else if (alg ==ShellSearch.class) {ShellSearch.sort(a);}
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        int N = 100;
        int T =1;
        System.out.print("InsertionSearch: " + timeRandomInput(InsertionSearch.class,N,T));
        System.out.println("SelectionSearch: " + timeRandomInput(SelectionSearch.class, N,T));
        System.out.println("ShellSearch: " + timeRandomInput(ShellSearch.class, N,T));
    }
}
