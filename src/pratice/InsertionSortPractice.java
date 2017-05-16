package pratice;

import com.zous.SortUtils;

/**
 * Created by zhuoxiuwu on 2017/5/16.
 */
public class InsertionSortPractice {

    public static void main(String[] args){
        double[] a = SortUtils.unSorted;
        double[] cloneArray = a.clone();
        int N = cloneArray.length;
        double target;
        int j;
        SortUtils.printArray(a);
        for (int i = N-1; i >0; i--) {
            j = i-1;
            target = cloneArray[i];
            System.out.println("target is "+target +"j+1 is "+cloneArray[j+1]);
            while (j <N-1 && target>cloneArray[j+1]){
                cloneArray[j-1] = cloneArray[j];
                j++;
            }
            cloneArray[j] = target;
        }
        SortUtils.printArray(cloneArray);
        SortUtils.isSorted(cloneArray);
    }
}
