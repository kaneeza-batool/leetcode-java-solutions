## Problem

Given an integer array `nums` sorted in **non-decreasing** order, return *an array of the squares of each number sorted in non-decreasing order*.

**Example 1:**

```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

```

**Example 2:**

```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

```

**Constraints:**

- `1 <= nums.length <= 104`
- `104 <= nums[i] <= 104`
- `nums` is sorted in **non-decreasing** order.

## Approach (Brute Force)

- Loop through `nums` and square each element using `Math.pow(nums[i], 2)`, casting to `int`
- Sort the modified array in-place using `Arrays.sort(nums)`
- Return `nums`

## Mistakes

- Forgot to typecast `Math.pow()` as it returns `double`, must cast to `int` explicitly: `(int)Math.pow(nums[i], 2)`
- Tried `nums = nums.sort() incorrectly. `Arrays.sort()` is a static method called as `Arrays.sort(nums)`, it sorts in-place and returns nothing

## Solution (Brute Force Approach)

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            nums[i] = (int)Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);

        return nums;
    }
}
```

## Time and Space Complexity

- **Time:** O(n log n) — Determined by sorting `Arrays.sort()`
- **Space:** O(1) — modifying the same array

## Approach (Two Pointers)

- Square all elements in-place using `nums[i] *= nums[i]`
- Use two pointers — `left` starting at 0, `right` at the last index
- Fill a result array from back to front (largest to smallest)
- At each step, compare `nums[left]` and `nums[right]` — whichever is larger goes into `result[pos]`, then move that pointer inward
- Return result

## Mistakes

- First attempt wasn't optimal
- This is my first two-pointer problem
- I learned it from a video

## Solution (Two pointers Approach)

```java
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
```

## Time and Space Complexity

- **Time:** O(n) — Single pass with two pointers
- **Space:** O(n) — New result array of size n

## Follow up

Squaring each element and sorting the new array is very trivial, could you find an `O(n)` solution using a different approach?
