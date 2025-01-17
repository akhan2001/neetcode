public class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            System.out.println(s);
            s = s.replace("()", "");
            System.out.println(s);
            s = s.replace("{}", "");
            System.out.println(s);
            s = s.replace("[]", "");
            System.out.println(s);
        }

        return s.isEmpty();
    }
}