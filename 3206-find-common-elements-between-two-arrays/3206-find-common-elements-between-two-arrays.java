class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        int count1 = 0;
        int count2 = 0;

        int[] result = new int[2];

//------------Add items into set-------

        for(int i : nums1){
            set1.add(i);
        }

        for(int i : nums2){
            set2.add(i);
        }

//------------Check items -------

        for(int i : nums1){
            if(set2.contains(i))
            count1++;
        }

        for(int i : nums2){
            if(set1.contains(i))
            count2++;
        }

        result[0] = count1;
        result[1] = count2;

        return result;

    }
}