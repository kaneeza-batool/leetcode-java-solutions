
## Problem

Given the array `nums` consisting of `2n` elements in the form `[x1,x2,...,xn,y1,y2,...,yn]`.

*Return the array in the form* `[x1,y1,x2,y2,...,xn,yn]`.

**Example 1:**

```
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

```

**Example 2:**

```
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

```

**Example 3:**

```
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]

```

**Constraints:**

- `1 <= n <= 500`
- `nums.length == 2n`
- `1 <= nums[i] <= 10^3`

## Approach

- Create a new array of size `2n`.
- Keep a pointer `count` that starts at 0.
- Loop from `i = 0` to `i < n`:
    - Put `nums[i]` at `count`.
    - Put `nums[i + n]` at `count + 1`.
    - Move `count` forward by 2.
- Return the new array.

## Mistakes

- Understood the problem but couldn’t think of solution so got help from youtube

## Solution

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
       int arr[] = new int[nums.length];
       int count=0;
       for(int i=0; i<n; i++) {
        arr[count] = nums[i];
        arr[count+1] = nums[i+n];
        count+=2;
       }
       return arr;
    }

}
```

## Time and Space Complexity

- Time : O(n) — Single loop up to n
- Space : O(n) — New result array of size 2n
