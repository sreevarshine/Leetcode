class Solution {
    public int strStr(String haystack, String needle) {
        int s=needle.length();
        int n=haystack.length();
        for(int i=0;i<=n-s;i++){
            String ss=haystack.substring(i,i+s);
            if(ss.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
