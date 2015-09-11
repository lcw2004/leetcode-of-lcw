/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution {

      /**   需要考虑
       *          1.    数组是无序的
       *          2.    数组有重复数字
       *                仅且仅 第一个大于第二个的情况下需要切换序号
       *
       *    思路：
       *          1.    先排序
       *          2.    取一个数，与之后的数相加对比，如果等于需要的数，返回
       *          3.    时间复杂度为（n*n）
       * @param nums
       * @param target
       * @return
       */
      public int[] twoSum(int[] nums, int target) {

            int index1 = 0;
            int index2 = 0;

            int len = nums.length;
            for (int i = 0; i < len; i++) {
                  int firstNum = nums[i];

                  for (int j = i + 1; j < len; j++) {
                        int lastNum = nums[j];

                        if(firstNum + lastNum == target) {
                              if(firstNum > lastNum) {
                                    index1 = j;
                                    index2 = i;
                              } else {
                                    index1 = i;
                                    index2 = j;
                              }
                        }
                  }
            }

            int[] resutl  = {index1 + 1, index2 + 1};
            return resutl;
      }
}