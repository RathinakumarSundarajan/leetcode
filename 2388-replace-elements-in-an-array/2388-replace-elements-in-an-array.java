class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            hash.put(nums[i], i);
        }

        for(var oper : operations){
            int index = hash.get(oper[0]);
            nums[index] = oper[1];
            hash.remove(oper[0]);
            hash.put(oper[1], index);
        }

        return nums;
    }
}