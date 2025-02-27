class Solution {
    public boolean areOccurrencesEqual(String s) {     //String s = "abacbc";
        
        HashMap<Character, Integer> map = new HashMap<>();  //{a=2, b=2, c=2}

        for (char ch : s.toCharArray()){       
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        int val = map.get(s.charAt(0));  //s.charAt(0) = 'a'  //val = hash.get('a') = 2
        for(int i : map.values()){   //This loops through {2, 2, 2}.
            if(i != val){
                return false;
            }
        }
        return true;
    }
}