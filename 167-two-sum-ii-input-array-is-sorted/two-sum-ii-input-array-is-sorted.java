class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a =numbers.length;
        int l=0;
        int r=a-1;
        while (l<r){
            if(numbers[l]+numbers[r]>target){
                r--;
            }
            else if (numbers[l]+numbers[r]<target){
                l++;
            }
            else{
                return new int[] {l+1,r+1};
            }
        }
        return null;
        
    }
}