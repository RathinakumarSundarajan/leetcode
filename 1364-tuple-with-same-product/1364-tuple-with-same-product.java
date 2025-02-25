class Solution {
    public int tupleSameProduct(int[] nums) {
        
        HashMap<Integer, Integer> productMap = new HashMap<>();

        int count = 0;

        for (int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int product = nums[i] * nums[j];
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }

        for(int num : productMap.values()){
            count += num * (num - 1) / 2 * 8;
        }

        return count;
    }
}