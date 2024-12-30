class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqNums = new HashMap<>();
        for (int n : nums) {
            // if (freqNums.containsKey(n)) {
            //     freqNums.put(n, freqNums.get(n) + 1);
            // } else {
            //     freqNums.put(n, 1);
            // }

            freqNums.put(n, (freqNums.getOrDefault(n, 0) + 1));
        }

        // System.out.println(freqNums);
        // System.out.println(freqNums.get(2));

        int[] freq = new int[k];
        for (int i = 0; i < k; i++) {
            int maxValueInMap = (Collections.max(freqNums.values()));
            
            for (Map.Entry<Integer, Integer> entry : freqNums.entrySet()) {
                if (entry.getValue() == maxValueInMap) {
                    // Add the key to the frequency array
                    freq[i] = entry.getKey();
                    // Remove the entry with the highest frequency
                    freqNums.remove(entry.getKey());
                    break; // Exit the loop after removing the entry
                }
            }
        }

        return freq;
        // return new int[k];
    }
}