class Solution {
    public long countBadPairs(int[] nums) {
        
        int n = nums.length;

        HashMap<Integer, Integer> freq = new HashMap<>();

        long goodPairs = 0;

        for(int i = 0; i < n; i++){
            int key = nums[i] - i;
            goodPairs += freq.getOrDefault(key, 0);
            freq.put(key, freq.getOrDefault(key,0) + 1);
        }

        return (long) n * (n-1) / 2 - goodPairs;
    }
}

// n * (n-1) / 2                n * (n+1) / 2
// ---------------             ---------------
// Pairs counting              Sum of numbers
// Multiplies by (n-1)         Multiplies by (n+1)
// Combinations                Arithmetic series sum
// Example: 6 pairs            Example: Sum = 10