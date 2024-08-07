class Solution {
    public void sortColors(int[] nums) {
        
        int zero = 0, one = 0, two = 0;
        
        for ( int x : nums){
            
            if ( x == 0 ){  
                zero++;
            }
            if ( x == 1 ){  
                one++;
            }
            if ( x == 2 ){  
                two++;
            }
        }
            
            int idx = 0;
            
            for ( int i = 0; i < zero; i++ ){
                nums[idx] = 0;
                idx++;
            }
            
            for ( int i = 0; i < one; i++ ){
                nums[idx] = 1;
                idx++;
            }
            
            for ( int i = 0; i < two; i++ ){
                nums[idx] = 2;
                idx++;
            }      
            
        
        
    }
}