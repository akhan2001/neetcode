class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        List<List<Integer>> sumList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int target = 0 - nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            System.out.println("target: " + target);
            while (j < k) {
                System.out.println("nums[j]: " + nums[j] + " | nums[k]: " + nums[k]);
                if (nums[j] + nums[k] == target) {
                    sumList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return new ArrayList<>();
    }
}