## Problem

Given a **1-indexed** array of integers `numbers` that is already ***sorted in non-decreasing order***, find two numbers such that they add up to a specific `target` number. Let these two numbers be `numbers[index1]` and `numbers[index2]` where `1 <= index1 < index2 <= numbers.length`.

Return *the indices of the two numbers* `index1` *and* `index2`*, **each incremented by one,** as an integer array* `[index1, index2]` *of length 2.*

The tests are generated such that there is **exactly one solution**. You **may not** use the same element twice.

Your solution must use only constant extra space.

**Example 1:**

```
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
```

**Example 2:**

```
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
```

**Example 3:**

```
Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
```

**Constraints:**

- `2 <= numbers.length <= 3 * 104`
- `1000 <= numbers[i] <= 1000`
- `numbers` is sorted in **non-decreasing order**.
- `1000 <= target <= 1000`
- The tests are generated such that there is **exactly one solution**.

## Approach

- Use two pointers `i` at start and `j` at end
- Compute sum of `numbers[i]` and `numbers[j]`
- If sum equals target, return `{i+1, j+1}` (1-based indices)
- If sum is less than target, increment `i` to increase sum
- If sum is greater than target, decrement `j` to decrease sum
- Repeat until pointers cross

## Mistakes

- Declared `j` as `numbers.length` instead of `numbers.length - 1` —caused out-of-bounds access
- Moved both pointers simultaneously — skips valid pairs, only one should move at a time
- Pointer movement wasn't based on sum comparison — logic was incorrect
- Returned `{i+1, j-1}` instead of `{i+1, j+1}` — wrong 1-based indexing
- Missing return statement at end — caused compilation error
- Recomputed sum multiple times — should store in a variable

## Solution

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] {i+1, j+1};
            }
            else if(numbers[i] + numbers[j] < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[] {};
    }
}
```

## Complexity

- **Time:** O(n) — Single pass with two pointer
- **Space:** O(1) — No extra structure used
