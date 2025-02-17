class Solution {
    public long minimumSteps(String s) {
        
        long i = 0;
        long answer = 0;

        for(int j = 0; j < s.length(); j++) {

            if(s.charAt(j) == '0'){
                
                answer = answer + (j - i);

                i++;
            }
        }

        return answer;
    }
}