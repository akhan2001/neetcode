
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int amount = (j - i) * Math.min(height[i], height[j]);
            // System.out.println("Min height: " + amount);
            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            } else {
                i++;
                j--;
            }
            
            if (amount > maxAmount) {
                maxAmount = amount;
            }
        }