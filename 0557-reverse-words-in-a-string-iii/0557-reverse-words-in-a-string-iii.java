class Solution {
    public String reverseWords(String s) {
        
        String [] arr = s.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for ( String x : arr){
            result.append(new StringBuilder(x).reverse()).append(" ");
        }
        
        return result.toString().trim();
        
    }
}