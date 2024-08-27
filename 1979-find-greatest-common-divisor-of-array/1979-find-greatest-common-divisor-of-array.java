class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        
        int x = nums[0];
        int y = nums[nums.length-1];
        
        return gcd(x, y);    
    }
    
// Helper method to calculate GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
