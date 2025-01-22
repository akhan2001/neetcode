class Solution {
    public void reverseString(char[] s) {
        
        int i = 0;
        int j = s.length - 1;
        // System.out.println(j);
        while (i < j) {
            // System.out.println(s[i]);
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            // System.out.println(s[j]);
            i++;
            j--;
        }
    }
}