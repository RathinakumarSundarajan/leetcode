class Solution {
    public String reverseWords(String s) {
                // Split the input string into an array of words based on space delimiter
        String [] arr = s.split(" ");
        
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word in the array
        for ( String x : arr){
            // Create a StringBuilder for each word, reverse it, and append to result
            result.append(new StringBuilder(x).reverse()).append(" ");
        }
        
        // Convert StringBuilder to String and trim trailing spaces
        return result.toString().trim();
        
    }
}