class Solution {
    public boolean isPalindrome(String s) {
        // Converting all uppercase letters to lowercase. Removing all non-alphanumeric characters
        String str = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        // System.out.println(str);

        char c1 = ' ';
        char c2 = ' ';
        int i = 0;
        int j = str.length() - 1;

        while (i < str.length() / 2) {            
            c1 = str.charAt(i);
            c2 = str.charAt(j);
            // System.out.println("i=" + i + " j=" + j);

            // System.out.println(c1 + " - " + c2);

            if (c1 != c2) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}