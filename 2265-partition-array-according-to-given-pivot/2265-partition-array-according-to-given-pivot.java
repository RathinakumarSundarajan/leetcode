class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] answer = new int[nums.length];

        int i = 0;

        for(int num : nums)
        if(num < pivot)
        answer[i++] = num;

        for(int num : nums)
        if(num == pivot)
        answer[i++] = num;

        for(int num : nums)
        if(num > pivot)
        answer[i++] = num;

        return answer;
    }
}