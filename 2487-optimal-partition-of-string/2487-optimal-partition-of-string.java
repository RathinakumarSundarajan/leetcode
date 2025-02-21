class Solution {
    public int partitionString(String s) {

        int subStr = 1;      // Minimum of one substring                          

        Set<Character> charSet = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(!charSet.contains(ch)){
                charSet.add(ch);
                continue;
            }

            subStr++;
            charSet.clear(); // Clear set for a new substring
            charSet.add(ch);
        }

        return subStr;
        
    }
} 

