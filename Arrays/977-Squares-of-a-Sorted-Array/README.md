## **Problem Summary**

Given a sorted array with negative numbers, return array of squares in sorted order.

---

## **Initial Thought Process**

Square each element in place then sort. Works but O(n log n).

---

## **Mistakes / Struggles**

- First approach was brute force O(n log n) — correct but not optimal
- Forgot to remove squaring loop when switching to Two Pointers approach
- Used `i < j` instead of `i <= j` — missed last element when pointers meet
- Compared `nums[i] > nums[j]` directly — fails with negatives, must use `Math.abs()`
- Returned `nums` instead of `result`

---

## **Key Observation**

Largest squares always come from both ends of a sorted array. Compare absolute values, place largest square at the back of result array, fill backwards.

---

## **Final Approach**

1. Initialize `left = 0`, `right = nums.length - 1`, `k = nums.length - 1`
2. While `left <= right`:
    - Compare `Math.abs(nums[left])` vs `Math.abs(nums[right])`
    - Place larger square at `result[k]`, move that pointer inward, `k--`
3. Return result

---

## **Dry Run**

```
nums = [-4, -1, 0, 3, 10]
left=0, right=4, k=4

abs(-4)=4 < abs(10)=10 → result[4]=100, right--, k--
abs(-4)=4 > abs(3)=3  → result[3]=16, left++, k--
abs(-1)=1 < abs(3)=3  → result[2]=9, right--, k--
abs(-1)=1 > abs(0)=0  → result[1]=1, left++, k--
abs(0)=0 == abs(0)=0  → result[0]=0, right--, k--

Output: [0,1,9,16,100] ✅
```

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(n) — result array

---

## **Revision Notes (30-second review)**

Two pointers from both ends. Compare absolute values. Place larger square at back of result. Fill backwards. O(n).

---

## **Similar Problems**

- LC 88 — Merge Sorted Array
- LC 167 — Two Sum II
- LC 75 — Sort Colors
