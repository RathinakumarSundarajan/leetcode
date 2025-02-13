class Solution {
    public int maxProduct(int[] nums) {
        
        if (nums.length == 0){
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];//Stores the minimum product (can become max if multiplied by a negative)

        for (int i = 1; i < nums.length; i++) {

            if(nums[i] < 0){ // Swap maxProduct and minProduct when encountering a negative number
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}