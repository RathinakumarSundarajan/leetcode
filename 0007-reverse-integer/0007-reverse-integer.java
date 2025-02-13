class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int digit = x % 10;
             
    // Overflow check BEFORE updating rev
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;
            
            rev = rev * 10 + digit;
            x /= 10;
        }
        
        return rev;
    }
}







// class Solution {
//     public int reverse(int x) {
        
//         int reversed = 0;

//         while(x != 0){
//             reversed = reversed * 10 + x % 10;
//             x /= 10;
//         }

//         return (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) ? 0 : reversed;
//     }
// }