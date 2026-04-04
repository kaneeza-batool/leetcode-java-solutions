## Problem

Given an array `nums`. We define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`.

Return the running sum of `nums`.

**Example 1:**

```
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
```

**Example 2:**

```
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
```

**Example 3:**

```
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

```

**Constraints:**

- `1 <= nums.length <= 1000`
- `-10^6 <= nums[i] <= 10^6`

## Approach

- Iterate through the array starting from index 1
- At each index, add the previous element to the current element
- This overwrites the array in-place with the running sum
- Return the modified array

## **Mistakes:**

- Got confused between `i < nums.length` and `i <= nums.length` — `<=` would cause ArrayIndexOutOfBoundsException because arrays are 0-indexed and `nums[nums.length]` doesn't exist
- Initially tried printing the array inside the method that is not needed, `return` is what matters


## **Complexity:**

- Time: O(n) — one loop, runs n times
- Space: O(1) — modified input in-place, no extra space used
