import java.util.Hashtable;

class Solution {
    public boolean isAnagram(String s, String t) {
        //Ensure length of s == t
        if (s.length() != t.length()) { 
            return false;
        }

        // HashSet<Character> sHash = new HashSet<>();
        HashMap<Character, Integer> sHash = new HashMap<>();
        HashMap<Character, Integer> tHash = new HashMap<>();
        //Add each letter into a hashset of s
        
        for (int i = 0; i < s.length(); i++) {
            // System.out.println(s.charAt(i));
            // int freq = 1;
            // if (sHash.containsKey(s.charAt(i))) {
            //     // freq += 1;
            //     sHash.put(s.charAt(i), sHash.get(s.charAt(i)) + 1);
            // } else {
            //     sHash.put(s.charAt(i), freq);
            // }

            sHash.put(s.charAt(i), sHash.getOrDefault((s.charAt(i)), 0) + 1);
            tHash.put(t.charAt(i), tHash.getOrDefault((t.charAt(i)), 0) + 1);
            // System.out.println(sHash);
        }

        for (int i = 0; i < t.length(); i++) {
            // int freq = 1;
            // if (tHash.containsKey(t.charAt(i))) {
            //     tHash.put(t.charAt(i), tHash.get(t.charAt(i)) + 1);
            // } else {
            //     tHash.put(t.charAt(i), freq);
            // }
        }

        System.out.println("s = " + sHash);
        System.out.println("t = " + tHash);

        return sHash.equals(tHash);
    }
}