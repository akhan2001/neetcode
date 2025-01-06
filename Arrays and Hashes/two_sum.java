class Solution {
    public int[] twoSum(int[] nums, int target) {

        // int[] returnNums = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             returnNums[0] = i;
        //             returnNums[1] = j;
        //             System.out.println("i = " + i + " | nums[i] = " + nums[i]);
        //             System.out.println("j = " + j + " | nums[j] = " + nums[j]);
        //             return returnNums;
        //         }
        //     }
        // }
        
        int[] returnNums = new int[2];
        HashMap<Integer, Integer> returnInt = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (returnInt.containsKey(diff)) {
                // System.out.println("i = " + i + " | " + returnInt.get(diff));
                returnNums[0] = returnInt.get(diff);
                returnNums[1] = i;
            } else {
                returnInt.put(nums[i], i);
            }
        }
        
        return returnNums;
    }
}