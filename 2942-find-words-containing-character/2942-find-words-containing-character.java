class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        List<Integer> list = new ArrayList();
        
        String charToString = Character.toString(x);
        
        for(int i = 0; i < words.length; i++){
            
            if(words[i].contains(charToString)){
                
                list.add(i);
            }
        }
        
        return list;
    }
}