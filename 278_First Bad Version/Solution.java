/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return findIn(1, n);
    }

    public int findIn(int first, int last) {
        System.out.println(first + " --> " + last);

        // ���first == last����ʾ�Ѿ������������һ�����ˣ���ǰ��������Ҫ�Ľ��
        if(first == last) {
            return first;
        }


        // (first + last) / 2 Խ��
        int middle = first + (last - first) / 2;

        if (isBadVersion(middle)) {
            // ���ǰһ���汾�Ƿ��ǻ��ģ�����ǻ��ģ����ŵݹ飬����Ǻõģ��򷵻ص�ǰ�汾
            if(!isBadVersion(middle - 1)) {
                // ���ص�ǰ�汾Ϊ��һ�����İ汾
                return middle;
            }
            return findIn(first, middle);
        } else {
            // �����ǰ�汾�Ǻõģ�����沿��
            return findIn(middle + 1, last);
        }
    }
}
