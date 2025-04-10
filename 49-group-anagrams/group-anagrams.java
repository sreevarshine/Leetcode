

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map <String,List<String>> map = new HashMap<>();
       for(String word : strs){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sortedw = new String(chars);

        if(!map.containsKey(sortedw)){
            map.put(sortedw , new ArrayList<>());
        }
        map.get(sortedw).add(word);
       }
       return new ArrayList<>(map.values());
    }
}

