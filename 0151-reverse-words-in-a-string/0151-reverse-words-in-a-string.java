class Solution {
    public String reverseWords(String s) {
        
        String[] arr = s.trim().split("\\s+");   
// Before Splitting: "Hello world this is Java"
// After Splitting: ["Hello", "world", "this", "is", "Java"]       
        int i = 0;
        
        int j = arr.length-1;
        
        while(i < j) {
            
            String temp = arr[i];
                
                arr[i] = arr[j];
            
                arr[j] = temp;
            
                i++;
                j--;                  
        }
        
        // Join the array of words into a single string separated by spaces
        return String.join(" ", arr);
        
    }
}


 