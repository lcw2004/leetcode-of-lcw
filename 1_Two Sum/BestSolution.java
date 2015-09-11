import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/11.
 */
public class BestSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> posMap = new HashMap<Integer, Integer>();

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int firstNum = nums[i];
            int secondNum = target - firstNum;
            if(posMap.containsKey(secondNum)) {
                return new int[]{posMap.get(secondNum) + 1, i + 1};
            } else {
                posMap.put(firstNum, i);
            }
        }

        return null;
    }
}
