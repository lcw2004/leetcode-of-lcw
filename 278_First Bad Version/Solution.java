/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return findIn(1, n);
    }

    public int findIn(int first, int end) {
        int centerPos = (first + end) / 2;

        System.out.println("find : " + first + "-->" + end);
        if (isBadVersion(centerPos)) {
            // 检查前一个版本是否是坏的，如果是坏的，接着递归，如果是好的，则返回当前版本
            if(!isBadVersion(centerPos - 1)) {
                // 返回当前版本为第一个坏的版本
                return centerPos;
            } else {
                return findIn(first, centerPos);
            }
        } else {
            // 如果当前版本是好的，查后面部分
            return findIn(centerPos + 1, end);
        }
    }
}

class VersionControl {
    boolean isBadVersion(int version) {
        int firstBadVersion = 10;
        return version >= firstBadVersion;
    }
}
