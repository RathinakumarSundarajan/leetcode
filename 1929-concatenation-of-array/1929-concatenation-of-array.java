class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] Result = new int[2*nums.length];
        
        for (int i = 0; i < nums.length; i++){
            
            Result[i] = nums[i];
        }
        
        for (int i = 0; i < nums.length; i++){
            
            Result[i + nums.length] = nums[i];
        }
        return Result;
    }
}