class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a)); // Step 2: Use a max heap to store characters by frequency

        maxHeap.addAll(map.keySet());


        StringBuilder sb = new StringBuilder();

        while(!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            for(int i = 0; i < map.get(c); i++){ // Append character `cnt.get(c)` times
                sb.append(c);
            }
        }
      return sb.toString();
    }
}