class Solution {
    public int trap(int[] height) {
        if (height.length < 3) return 0;

        int i = 0, j = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (i < j) {
            if (height[i] < height[j]) {
                if (height[i] > leftMax) {
                    leftMax = height[i];
                    System.out.println("leftMax = " + leftMax);
                } else {
                    water += leftMax - height[i];
                    System.out.println("Water (left): " + water);
                }
                i++;
            } else {
                if (height[j] > rightMax) {
                    rightMax = height[j];
                    System.out.println("RightMax = " + rightMax);
                } else {
                    water += rightMax - height[j];
                    System.out.println("Water (right): " + water);
                }
                j--;
            }
        }
        return water;
    }
}