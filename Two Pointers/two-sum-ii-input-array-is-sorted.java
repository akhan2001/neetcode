class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnNums = new int[2];
        // HashMap<Integer, Integer> returnInt = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     int diff = target - nums[i];
        //     if (returnInt.containsKey(diff)) {
        //         // System.out.println("i = " + i + " | " + returnInt.get(diff));
        //         returnNums[0] = returnInt.get(diff) + 1;
        //         returnNums[1] = i + 1;
        //         break;
        //     } else {
        //         returnInt.put(nums[i], i);
        //     }
        // }

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            // System.out.println(nums[i] + " : " + nums[j]);
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                returnNums[0] = i + 1;
                returnNums[1] = j + 1;
                break;
            }
        }
        
        return returnNums;
    }
}