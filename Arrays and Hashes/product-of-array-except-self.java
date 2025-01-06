class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        // int[] prefix = new int[nums.length];
        // int[] postfix = new int[nums.length];
    
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            answer[i] = answer[i] * postfix;
            postfix = postfix * nums[i];
        }

        return answer;
    }
}