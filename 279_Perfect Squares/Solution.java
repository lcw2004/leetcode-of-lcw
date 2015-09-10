/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

import java.util.*;

public class Solution {

    Set<Integer> countList = new HashSet<Integer>();
    List<Integer> list = new LinkedList<Integer>();

    /**
     * 思路：
     * 1.  对当前数求根号，得到当前数以下的最大值
     * 2.  再将当前数减掉上一值的，得到另外一个数，再求根
     * @param n
     * @return
     */
    public int numSquares(int n) {
        for (int i = 0; i < (int) Math.sqrt(n); i++) {
            countList.add(doOn1(n, 0, i));

            System.out.println(Arrays.toString(list.toArray()));
            list.removeAll(list);
        }

        Object[] countArray = (Object[]) (countList.toArray());
        Arrays.sort(countArray);
        System.out.println(Arrays.toString(countArray));

        return (Integer)countArray[0];
    }

    public int doOn(int n, int count) {
        if(n == 0) {
            return count;
        }
        count++;

        int maxNum = (int) Math.sqrt(n);
        int num_p = maxNum * maxNum;
        list.add(num_p);

        if (maxNum > 0) {
            int newNum = n - num_p;
            return doOn(newNum, count);
        }
        return count;
    }

    public int doOn1(int n, int count, int firstDown) {
        if(n == 0) {
            return count;
        }
        count++;

        int maxNum = (int) Math.sqrt(n);
        int num_p = (maxNum - firstDown) * (maxNum - firstDown);
        list.add(num_p);
//        System.out.println(Arrays.toString(list.toArray()));

        if (maxNum > 0) {
            int newNum = n - num_p;
            return doOn(newNum, count);
        }
        return count;
    }
}