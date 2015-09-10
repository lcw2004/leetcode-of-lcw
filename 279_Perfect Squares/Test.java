/**
 * Created by Lcw on 2015/9/10.
 */
public class Test {

    @org.junit.Test
    public void testSolution() {
//        testSolution(12);
//        testSolution(9);
//        testSolution(27);
//        testSolution(28);
        testSolution(48);

//        for (int i = 1; i < 20; i++) {
//            testSolution(i);
//        }
    }

    private static void testSolution(int n) {
        System.out.println("----------------------");
        Solution solution = new Solution();
        int reusult = solution.numSquares(n);
        System.out.println(String.format("The result of %d is %d ", n, reusult));
    }

}
