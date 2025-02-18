class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){ // freq.get(num[i]) == 1  ensures we only consider numbers that appear exactly once.
            if(freq.get(nums[i]) == 1 && !freq.containsKey(nums[i]-1) && !freq.containsKey(nums[i]+1)){
            answer.add(nums[i]);
        }
    }

        return answer;
    }
}