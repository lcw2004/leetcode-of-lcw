/**
 * Created by Lcw on 2015/9/10.
 */
public class VersionControl {
    public static int FIRST_BAD_VERSION = 1111111;
    boolean isBadVersion(int version) {
        return version >= FIRST_BAD_VERSION;
    }
}
