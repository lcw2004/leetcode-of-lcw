/**
 * Created by Administrator on 2015/9/10.
 */
public class Test {

    public static void main(String[] args) {
//        findIn(10);
//        findIn(200);
//        findIn(180);
//        findIn(22);
//        findIn(11);
        findIn(1111111111);
        findIn(2126753390);
    }

    public static void findIn(int n) {
        Solution solution = new Solution();
        System.out.println("-----------");
        int firstBadVersion = solution.firstBadVersion(n);
        System.out.println("Result:" + firstBadVersion);
    }
}
