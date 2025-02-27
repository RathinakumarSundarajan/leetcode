class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int arr[] = new int[26];

        for(char ch : sentence.toCharArray()){
            arr[ch - 'a']++;
        }

        for(int num : arr){
            if( num == 0){
                return false;
            }
        }

        return true;
    }
}