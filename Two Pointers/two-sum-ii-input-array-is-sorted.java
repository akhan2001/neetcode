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

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                } else if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }

                if (nums[j] + nums[k] < target) {
                    j++;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    sumList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }

        return sumList;
    }
}