package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) != string.charAt(end)) {
                break;
            }
            mirror += String.valueOf(string.charAt(end));
        }

        return begin == end || begin == end + 1 ? string : mirror;
    }
}
