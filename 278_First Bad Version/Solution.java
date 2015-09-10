/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return findIn(1, n);
    }

    public int findIn(int first, int last) {
        System.out.println(first + " --> " + last);

        // 如果first == last，表示已经检索到了最后一个数了，当前数即是需要的结果
        if(first == last) {
            return first;
        }


        // (first + last) / 2 越界
        int middle = first + (last - first) / 2;

        if (isBadVersion(middle)) {
            // 检查前一个版本是否是坏的，如果是坏的，接着递归，如果是好的，则返回当前版本
            if(!isBadVersion(middle - 1)) {
                // 返回当前版本为第一个坏的版本
                return middle;
            }
            return findIn(first, middle);
        } else {
            // 如果当前版本是好的，查后面部分
            return findIn(middle + 1, last);
        }
    }
}
