import org.junit.Assert;

import java.util.Arrays;

/**
 * Created by Lcw on 2015/9/10.
 */
public class Test {

    @org.junit.Test
    public void testSolution() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;

        Solution solution = new Solution();
        int[] resultArray = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(resultArray));

    }

    @org.junit.Test
    public void testSolution1() {

    }


}
