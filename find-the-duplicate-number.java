class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> duplicateSet = new HashSet<>();
        int duplicate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (duplicateSet.contains(nums[i])) {
                duplicate = nums[i];
                break;
            }
            duplicateSet.add(nums[i]);
        }
        
        return duplicate;
    }
}