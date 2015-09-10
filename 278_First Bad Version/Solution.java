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
            // ���ǰһ���汾�Ƿ��ǻ��ģ�����ǻ��ģ����ŵݹ飬����Ǻõģ��򷵻ص�ǰ�汾
            if(!isBadVersion(centerPos - 1)) {
                // ���ص�ǰ�汾Ϊ��һ�����İ汾
                return centerPos;
            } else {
                return findIn(first, centerPos);
            }
        } else {
            // �����ǰ�汾�Ǻõģ�����沿��
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
