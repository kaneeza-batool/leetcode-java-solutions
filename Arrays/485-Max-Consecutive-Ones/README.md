## Problem

Given a binary array `nums`, return *the maximum number of consecutive* `1`*'s in the array*.

**Example 1:**

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

```

**Example 2:**

```
Input: nums = [1,0,1,1,0,1]
Output: 2

```

**Constraints:**

- `1 <= nums.length <= 105`
- `nums[i]` is either `0` or `1`

## Approach

- Initialise `count` to track current consecutive 1s and `max` to track the highest seen so far, both set to 0
- Loop through the array
- If current element is `1`, increment `count` and update `max` using `Math.max(max, count)`
- If current element is `0`, reset `count` to 0
- Return `max`

## Mistakes

- No bugs. Solved in one clean attempt.
- Had to think about resetting `count` to 0 when a 0 is encountered.

## Time and Space Complexity

- **Time:** O(n) — single pass through the array
- **Space:** O(1) — only two counters needed
