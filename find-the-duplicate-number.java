class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (duplicateSet.contains(nums[i])) {
                return nums[i];
            }
            duplicateSet.add(nums[i]);
        }
        
        return 0;
    }
}