## **Problem Summary**

Given array `[x1,x2,x3,y1,y2,y3]` of length 2n, return it interleaved as `[x1,y1,x2,y2,x3,y3]`.

---

## **Initial Thought Process**

Loop with i+2 increment and swap in place. Both were wrong — increment did nothing, and in-place swap overwrites needed values.

---

## **Mistakes / Struggles**

- Used `i+2` as increment instead of `i++` — does nothing, not a valid increment
- Tried to swap in place — overwrites values still needed
- Used `i` and `i+1` as result indices instead of `2*i` and `2*i+1`
- Copied from `result` instead of `nums` for y values

---

## **Key Observation**

When filling two slots per iteration, result indices are `2*i` and `2*i+1`. X values are at `nums[i]`, Y values are at `nums[i+n]`.

---

## **Final Approach**

1. Create `result[]` of size `2*n`
2. Loop from `i=0` to `n`
3. `result[2*i] = nums[i]`
4. `result[2*i+1] = nums[i+n]`
5. Return result

---

## **Dry Run**

```
nums = [2,5,1,3,4,7], n=3

i=0 → result[0]=2, result[1]=3
i=1 → result[2]=5, result[3]=4
i=2 → result[4]=1, result[5]=7

Output: [2,3,5,4,1,7] ✅
```

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(n) — result array of size 2n

---

## **Revision Notes (30-second review)**

New array size 2n. Loop to n. result[2*i] = nums[i], result[2*i+1] = nums[i+n]. Return result.

---

## **Similar Problems**

- LC 1929 — Concatenation of Array
- LC 905 — Sort Array By Parity
