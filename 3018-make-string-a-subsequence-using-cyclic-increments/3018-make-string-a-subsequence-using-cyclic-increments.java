class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {


        int idx1 = 0;
        int idx2 = 0;
        int m = str1.length();
        int n = str2.length();


        while(idx1 < m && idx2 < n){

            int first = str1.charAt(idx1) - 'a';
            int second = str2.charAt(idx2) - 'a';

            if(first == second || first + 1 == second || (first == 25 && second == 0)){
                idx1++;
                idx2++;
            } else{
                idx1++;
            }
        }
        return (idx2 == n);

    }
}



// int first=str1.charAt(idx1)-'a';
// int second=str2.charAt(idx2)-'a';

// Character: 'a'  →  ASCII Value: 97  →  Calculation: (97 - 97)  →  Result: 0  
// Character: 'b'  →  ASCII Value: 98  →  Calculation: (98 - 97)  →  Result: 1  
// Character: 'c'  →  ASCII Value: 99  →  Calculation: (99 - 97)  →  Result: 2  
// Character: 'z'  →  ASCII Value: 122 →  Calculation: (122 - 97) →  Result: 25  
