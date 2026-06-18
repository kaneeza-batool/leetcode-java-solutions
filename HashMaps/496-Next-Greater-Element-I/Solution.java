class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while ((!stack.isEmpty()) && (nums2[i] > stack.peek())) {
                int popped = stack.pop();
                mp.put(popped, nums2[i]);
            }

            stack.push(nums2[i]);
        }

        while (!stack.isEmpty()) {
            int popped = stack.pop();
            mp.put(popped, -1);
        }

        int[] result = new int[nums1.length];
        for (int i=0; i<nums1.length; i++) {
            result[i] = mp.get(nums1[i]);
        }

        return result;
    }
}
