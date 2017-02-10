/**
 * Created by zhuoxiuwu on 2017/2/9.
 */
public class MathTest {
    public static void main(String[] args) {
        //溢出 导致 还是-2147483648
        System.out.println(Math.abs(-2147483648));
    }
}
