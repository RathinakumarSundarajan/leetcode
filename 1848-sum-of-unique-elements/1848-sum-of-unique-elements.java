class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int answer = 0;

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == 1){
                answer += nums[i];
            }
             if(map.get(nums[i]) == 2){
                answer -= nums[i];
            }
        }

        return answer;
    }
}