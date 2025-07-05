class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        boolean[] used = new boolean[m.length]; // Track used letters in magazine

        for (int i = 0; i < r.length; i++) {
            boolean found = false;
            for (int j = 0; j < m.length; j++) {
                if (r[i] == m[j] && !used[j]) {
                    used[j] = true; // Mark letter as used
                    found = true;
                    break; // Found a match, move to next letter in ransomNote
                }
            }
            if (!found) {
                return false; // Couldn’t find required letter
            }
        }
        return true; // All letters matched
    }
}
