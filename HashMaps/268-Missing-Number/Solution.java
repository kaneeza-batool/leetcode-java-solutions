class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfRange = ( n * (n+1) ) /2;

        for (int i=0; i<n; i++) {
            sumOfRange -= nums[i];
        }

        return sumOfRange;
        
    }
}
