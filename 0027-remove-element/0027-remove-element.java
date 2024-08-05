class Solution {
    public int removeElement(int[] num, int val) {
        
        int index = 0;
        
        for(int i = 0; i < num.length; i++){
            
            if(num[i] != val){
                num[index] = num[i];
                index++;
            }
        }
        return index;
    }
}