class Solution {
    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // System.out.println(str);

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {            
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}