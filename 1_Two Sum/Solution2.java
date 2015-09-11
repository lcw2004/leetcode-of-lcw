/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

import java.util.*;

public class Solution2 {

      public int[] twoSum(int[] nums, int target) {
            int index1 = 0;
            int index2 = 0;

            // 将数据放入MAP，将数据对应的序号放入List
            Map<Integer, List> numPosMap = new HashMap<Integer, List>();
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                  int num = nums[i];

                  List<Integer> posList;
                  if(numPosMap.containsKey(num)) {
                        posList = numPosMap.get(num);
                  } else {
                        posList = new LinkedList<Integer>();
                  }

                  posList.add(i);
                  numPosMap.put(num, posList);
            }

            // 遍历MAP
            for (Iterator it = numPosMap.keySet().iterator(); it.hasNext(); ) {
                  int currentNum = (Integer)it.next();
                  int nextNum = target - currentNum;

                  if(numPosMap.containsKey(nextNum)) {
                        if(currentNum == nextNum) {
                              // 如果相等，则取前两个
                              index1 = (Integer)numPosMap.get(currentNum).get(0) + 1;
                              index2 = (Integer)numPosMap.get(currentNum).get(1) + 1;
                        } else {
                              // 如果不想等，则各取第一个
                              index1 = (Integer)numPosMap.get(currentNum).get(0) + 1;
                              index2 = (Integer)numPosMap.get(nextNum).get(0) + 1;
                        }
                        break;
                  }
            }

            if(index1 > index2) {
                  return new int[]{index2, index1};
            } else {
                  return new int[]{index1, index2};
            }
      }

}