## **Problem Summary**

Given array nums of length n, return array of length 2n where nums appears twice consecutively.

---

## **Initial Thought Process**

Create new array of size 2n. Fill first half and second half simultaneously using same loop. Return result.

---

## **Mistakes / Struggles**

- None. Clean solve.

---

## **Key Observation**

`ans[i]` and `ans[i+n]` can both be filled in a single loop pass. No need for two separate loops.

---

## **Final Approach**

1. `n = nums.length`
2. Create `ans[]` of size `2*n`
3. Loop from `i = 0` to `n`
4. `ans[i] = nums[i]` and `ans[i+n] = nums[i]`
5. Return ans

---

## **Dry Run**

```
nums = [1, 2, 3]
n = 3

i=0 → ans[0]=1, ans[3]=1
i=1 → ans[1]=2, ans[4]=2
i=2 → ans[2]=3, ans[5]=3

Output: [1,2,3,1,2,3] ✅
```

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(n) — new array of size 2n

---

## **Revision Notes (30-second review)**

New array size 2n. One loop. ans[i] and ans[i+n] both equal nums[i]. Return ans.

---

## **Similar Problems**

- LC 1480 — Running Sum of 1D Array
- LC 1470 — Shuffle the Array

---
