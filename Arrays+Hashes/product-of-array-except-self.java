class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    // System.out.println(j);
                    product = product * nums[j];
                    System.out.println(nums[j]);
                    // System.out.println(product);
                    answer[i] = product;
                }
            }
        }

        return answer;
    }
}