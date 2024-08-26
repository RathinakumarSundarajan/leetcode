class Solution {
    public int[] buildArray(int[] nums) {
        
      
        
        int[] Result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            
            int a=nums[i]; // this line play important role.
            
            Result[i] = nums[a];
            
        }
        
        return Result;
    }
}


        
