import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        if (nums.length == 0) { return 0; }

        Set<Integer> consecutiveHash = new HashSet<>();
        int count = 0;

        for (int n : nums) {
            consecutiveHash.add(n);
        }

        int longestStreak = 0;

        for (int num : consecutiveHash) {
            if (!consecutiveHash.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (consecutiveHash.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        System.out.println(longestStreak);

        return longestStreak;
    }
}