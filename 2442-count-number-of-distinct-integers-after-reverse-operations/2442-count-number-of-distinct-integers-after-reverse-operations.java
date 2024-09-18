class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for( int i : nums) {
            
            set.add(i);
            
            set.add(reverseFunc(i));
        }
        
        return set.size();  
        
    }
    
    
    
    
    static int reverseFunc(int n) {
        
        int reversed = 0;
        
        while(n != 0) {
            
            int reminder = n % 10;
            
            reversed = reversed * 10 + reminder;
            
            n /= 10;
        }
        
        return reversed;
    }
    
    
    
    
}