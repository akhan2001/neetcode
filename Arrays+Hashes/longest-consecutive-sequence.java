class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> consecutiveHash = new HashSet<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            consecutiveHash.add(nums[i]);
        }

        System.out.println(consecutiveHash);

        return count;
    }
}