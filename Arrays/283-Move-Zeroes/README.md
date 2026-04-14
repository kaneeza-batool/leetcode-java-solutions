## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.

**Example 1:**

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

**Example 2:**

```
Input: nums = [0]
Output: [0]

```

**Constraints:**

- `1 <= nums.length <= 104`
- `231 <= nums[i] <= 231 - 1`

## Approach (Brute Force)

- Use pointer `j` to track the last position where a zero should be placed, starting at `nums.length - 1`
- Loop through the array with pointer `i`
- When a zero is found at index `i`, shift all elements between `i` and `j` one step left
- Place a zero at position `j` and shrink `j` by 1
- Decrement `i` to recheck the same index since elements shifted left
- Repeat until `i` exceeds `j`

## Mistakes

- `j` was declared inside the outer loop — gets reset on every iteration, so it never actually tracks the shrinking boundary correctly
- `nums[i] = nums[k]` is wrong — you're overwriting `nums[i]` directly instead of shifting each element one step left. Correct shift is `nums[k-1] = nums[k]`
- After shifting, didn't decrement `i` — so the zero that got shifted into position `i` was skipped on the next iteration

## Solution (Brute Force)

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int j = nums.length - 1; // move outside

        for (int i = 0; i <= j; i++) {
            if (nums[i] == 0) {

                // shift elements left
                for (int k = i; k < j; k++) {
                    nums[k] = nums[k + 1];
                }

                nums[j] = 0; // put zero at end
                j--;         // shrink effective array
                i--;         // recheck same index
            }
        }
    }
}
```

## Time and Space Complexity

- **Time:** O(n^2) — For every zero found, you shift all elements left, that's O(n) inside O(n)
- **Space: O(1) —** In-place, no extra array

## Approach (Two Pointer)

- Use pointer `pos` to track where the next non-zero element should go, starting at 0
- Loop through the array with pointer `i`
- When a non-zero element is found, swap `nums[i]` with `nums[pos]` and increment `pos`
- Zeros naturally bubble to the end as non-zero elements swap forward
- Return is implicit — modified in-place

## Mistakes

- Took Help from AI

## Solution

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        // move all non-zero elements forward
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        } 
    }
}
```

## Time and Space Complexity

- **Time:** O(n) — Single pass through the array
- **Space: O(1) —** In-place, no extra array
