class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            nums[i] *=nums[i];
        }

        int left = 0;
        int right = nums.length-1;

        for (int pos=nums.length-1; pos>=0; pos--) {
            if(nums[left] > nums[right]) {
                result[pos] = nums[left];
                left++;
            }
            else {
                result[pos] = nums[right];
                right--;
            }
        }

        return result;
    }
}
