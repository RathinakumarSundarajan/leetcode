class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int result = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            
            int temp = 0;
            
            for (int j = 0; j < accounts[i].length; j++){
                
                temp = temp + accounts[i][j] ;
            }
            
            result = Math.max(result, temp);
        }
        
        return result;
        
    }
}


// s+=accounts[i][j];
