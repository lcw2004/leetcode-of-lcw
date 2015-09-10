import org.junit.Assert;

/**
 * Created by Lcw on 2015/9/10.
 */
public class Test {

    @org.junit.Test
    public void testSolution() {
        find_Solution(1111111111);
        find_Solution(2126753390);
    }

    @org.junit.Test
    public void testSolution1() {
        find_Solution1(1111111111);
        find_Solution1(2126753390);
    }

    public static void find_Solution(int n) {
        Solution solution = new Solution();
        System.out.println("--------------------");
        int firstBadVersion = solution.firstBadVersion(n);
        System.out.println("Result:" + firstBadVersion);
        System.out.println("--------------------");

        Assert.assertTrue(firstBadVersion == VersionControl.FIRST_BAD_VERSION);
    }

    public static void find_Solution1(int n) {
        Solution1 solution = new Solution1();
        System.out.println("--------------------");
        int firstBadVersion = solution.firstBadVersion(n);
        System.out.println("Result:" + firstBadVersion);
        System.out.println("--------------------");

        Assert.assertTrue(firstBadVersion == VersionControl.FIRST_BAD_VERSION);
    }
}
