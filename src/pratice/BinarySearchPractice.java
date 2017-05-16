package pratice;

/**
 * Created by zhuoxiuwu on 2017/5/16.
 */
public class BinarySearchPractice {
    public static int rank(int key, int src[]) {
        int left = 0;
        int right = src.length - 1;
        while (left <=right){
            int mid=left+ (right - left) /2;
            if (key <src[mid])
                right = mid -1;
            else if (key>src[mid])
                left= mid+1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = rank(10, new int[]{1, 3, 5, 6, 10, 11, 12});
        System.out.println("the key 10 is in  "+index);
    }
}
