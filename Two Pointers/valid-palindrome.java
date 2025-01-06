class Solution {
    public boolean isPalindrome(String s) {
        // Converting all uppercase letters to lowercase. Removing all non-alphanumeric characters
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        return true;
    }
}