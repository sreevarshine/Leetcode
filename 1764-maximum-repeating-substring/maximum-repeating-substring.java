class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder target = new StringBuilder(word);

        while(sequence.contains(target.toString())){
            count++;
            target.append(word);
        }
        return count;
    }
}