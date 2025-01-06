import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            if (!groupMap.containsKey(key)) {
                groupMap.put(key, new ArrayList<>());
            }
            
            List<String> tmp = groupMap.get(key);
            tmp.add(s);
            // System.out.println(groupMap);
        }

        // System.out.println(groupMap.values());
        List<List<String>> groupAnagram = new ArrayList<>();
        for (String v: groupMap.keySet()) {
            String key = v.toString();
            // String value = groupMap.get(v).toString();
            // System.out.println(key + " = " + groupMap.get(v));
            groupAnagram.add(groupMap.get(v));
        }
        System.out.println(groupAnagram);
        // groupAnagram = groupMap.values();

        return groupAnagram;
    }
}