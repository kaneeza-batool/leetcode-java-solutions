## **Problem Summary**

Move all zeroes to the end of array while maintaining relative order of non-zero elements. In-place, no extra space. (Slow and Fast pointer)

---

## **Initial Thought Process**

Two pointers i and j with j=i+1, swap when i is zero. Flawed — j was fixed relative to i and didn't handle consecutive zeroes. 

---

## **Mistakes / Struggles**

- Initial approach used opposite direction thinking — wrong pattern for this problem
- Declared `int j` twice — duplicate variable declaration
- Loop condition was `i < nums.length` while incrementing `j` — wrong variable in condition

---

## **Key Observation**

Slow pointer tracks where next non-zero should go. Fast pointer scans for non-zero elements. When fast finds non-zero, swap with slow and advance slow. Zeroes naturally sink to the end.

---

## **Final Approach**

1. `slow = 0`, `fast = 0`
2. Loop fast through array
3. If `nums[fast] != 0` → swap `nums[slow]` with `nums[fast]`, `slow++`
4. If `nums[fast] == 0` → do nothing, fast keeps moving

---

## **Dry Run**

```
nums = [0,1,0,3,12]

fast=0 → 0, skip
fast=1 → 1, swap with slow=0 → [1,0,0,3,12], slow=1
fast=2 → 0, skip
fast=3 → 3, swap with slow=1 → [1,3,0,0,12], slow=2
fast=4 → 12, swap with slow=2 → [1,3,12,0,0], slow=3

Output: [1,3,12,0,0] ✅
```

---

## **Time Complexity**

O(n) — single pass

**Space Complexity**
O(1) — in-place

---

## **Revision Notes (30-second review)**

Slow tracks next non-zero position. Fast scans array. Non-zero found → swap with slow, slow++. Zeroes sink to end automatically.

---

## **Similar Problems**

- LC 27 — Remove Element
- LC 26 — Remove Duplicates from Sorted Array
- LC 977 — Squares of a Sorted Array
