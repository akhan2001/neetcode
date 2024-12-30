class Solution {

    public String encode(List<String> strs) {
        String word = "";
        for (String s : strs) {
            word += Integer.toString(s.length()) + "*" + s;
        }
        System.out.println(word);

        return word;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '*') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
