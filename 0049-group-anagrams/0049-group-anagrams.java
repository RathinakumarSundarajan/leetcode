class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

         Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();  // Step 1: Convert to char array - Convert "eat" to a char array: ['e', 'a', 't']
            Arrays.sort(chars);              // Step 2: Sort the array - Sort the char array: ['a', 'e', 't']
            String key = new String(chars);  // Step 3: Convert back to string - Convert back to string: "aet"
            
            if (!ans.containsKey(key)) {     // Step 4: If key doesn't exist, create a new list - Check if "aet" exists in ans → No, so create a new list.
                ans.put(key, new ArrayList<>()); // Add "eat" to the list.
            }
            ans.get(key).add(s);             // Step 5: Add the original word to the group
        }

        return new ArrayList<>(ans.values()); // Step 6: Return grouped anagrams -  if "aet" exists in ans → Yes, add "tea" to the existing list
    }
}



// Time and Space Complexity
// ✅ Time Complexity: O(N * K log K)
// N: Number of words
// K log K: Sorting each word (where K is the max length of a word)
// So, total complexity is O(NK log K)

// ✅ Space Complexity: O(NK)
// We store all words in a HashMap.
