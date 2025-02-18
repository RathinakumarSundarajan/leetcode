class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> majority = new ArrayList<>();

        for(Integer key : map.keySet()){
            if(map.get(key) > n/3){
                majority.add(key);
            }
        }

        return majority;
    }
}