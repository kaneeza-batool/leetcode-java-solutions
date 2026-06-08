## **Problem Summary**

Given an array, return a new array where each element is the sum of all previous elements, including itself. 

---

## **Initial Thought Process**

Loop through the array, add the current element to the previous element. Start from index 1 to avoid out of bounds at index -1.

---

## **Mistakes / Struggles**

- Initially declared `int i=0` twice, duplicate variable declaration in Java

---

## **Key Observation**

Each element only needs the element directly before it  because that previous element already contains the cumulative sum up to that point.

---

## **Final Approach**

1. Start loop from `i = 1`
2. Each iteration: `nums[i] = nums[i] + nums[i-1]`
3. Return `nums`

---

## Solution

```java
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        return nums;
    }
}
```

---

## **Dry Run**

```
Input: [1, 2, 3, 4]

i=1 → nums[1] = 2+1 = 3  → [1,3,3,4]
i=2 → nums[2] = 3+3 = 6  → [1,3,6,4]
i=3 → nums[3] = 4+6 = 10 → [1,3,6,10]

Output: [1,3,6,10]
```

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(1) — modified in place, no extra array

---

## **Revision Notes (30-second review)**

Loop from index 1. Each element = itself + previous. Return array. O(n) time, O(1) space.

---

## **Similar Problems**

- LC 303 — Range Sum Query
- LC 724 — Find Pivot Index
- LC 238 — Product of Array Except Self
