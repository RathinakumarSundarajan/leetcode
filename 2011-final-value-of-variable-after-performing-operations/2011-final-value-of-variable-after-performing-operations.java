class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int result = 0;
        
        for ( int i = 0; i < operations.length; i++){
            
            if ( operations[i].contains("X++") || operations[i].contains("++X")) {
                
                result ++;
            }
            
            else result --;         
        }
        
        return result;
              
    }
}