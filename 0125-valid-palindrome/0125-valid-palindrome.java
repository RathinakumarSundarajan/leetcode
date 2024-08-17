class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder modiStr = new StringBuilder();
        
        for (char c : s.toCharArray()){
            
            if( Character.isLetterOrDigit(c)){
                
                modiStr.append(Character.toLowerCase(c));
                
            }
        }
        
        
        String forwdStr = modiStr.toString();
        String reverseStr = modiStr.reverse().toString();
        return forwdStr.equals(reverseStr);
        
    }
}