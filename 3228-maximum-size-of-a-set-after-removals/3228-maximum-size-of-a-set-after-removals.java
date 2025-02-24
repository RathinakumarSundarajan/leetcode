class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        HashSet<Integer> s3 = new HashSet<>();
        
        for(int num : nums1){
            s1.add(num);
            s3.add(num);
        }

        for(int num : nums2){
            s2.add(num);
            s3.add(num);
        }

        return Math.min(Math.min(s1.size(), nums1.length/2) + Math.min(s2.size(), nums2.length/2), s3.size());
    }
}