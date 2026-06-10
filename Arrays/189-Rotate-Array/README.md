## **Problem Summary**

Rotate array to the right by k steps in-place.

---

## **Initial Thought Process**

Copy last k elements to front of result, copy first n-k elements to back. Copy result back to nums.

---

## **Mistakes / Struggles**

- Tried reversing instead of rotating initially
- Modified k inside loop — never modify k, it's a fixed value
- Used `i < n` instead of `i < n-k` in second loop
- Missing `k = k % n` — causes ArrayIndexOutOfBounds when k > n
- Typo: `nus.length`

---

## **Key Observation**

Always reduce k with `k % n` first. When k >= n, full rotations cancel out. Last k elements go to front, first n-k elements shift to back.

---

## **Final Approach (Brute Force — O(n) space)**

1. `k = k % n`
2. Loop 1: `result[i] = nums[n-k+i]` for i from 0 to k
3. Loop 2: `result[k+i] = nums[i]` for i from 0 to n-k
4. Copy result back to nums

---

## **Optimal Approach (looked up — redo later)**
Reverse trick — O(n) time, O(1) space:

1. Reverse entire array
2. Reverse first k elements
3. Reverse remaining n-k elements

---

## **Dry Run**

```
nums = [1,2,3,4,5,6,7], k=3

Loop 1: result = [5,6,7,0,0,0,0]
Loop 2: result = [5,6,7,1,2,3,4]
Copy back to nums ✅
```

---

## **Pattern Used**

Array — Index Mapping (brute force)
Two Pointers — Reverse Trick (optimal)

---

## Complexity

**Time Complexity**
Brute force: O(n) time, O(n) space
Optimal: O(n) time, O(1) space

**Space Complexity**
Brute force: O(n)
Optimal: O(1)

---

## **Revision Notes (30-second review)**

k = k%n first. Last k elements to front, first n-k to back. Copy result to nums. Optimal: reverse full, reverse first k, reverse rest.

---

## **Similar Problems**

- LC 186 — Reverse Words in a String II
- LC 796 — Rotate String
- LC 48 — Rotate Image
