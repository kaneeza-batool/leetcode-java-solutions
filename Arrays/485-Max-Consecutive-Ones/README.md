## **Problem Summary**

Given a binary array, return the maximum number of consecutive 1s.

---

## **Initial Thought Process**

Compare adjacent elements `nums[i] == nums[i+1]`. Flawed — misses single 1s and never resets count on 0.

---

## **Mistakes / Struggles**

- Compared adjacent elements instead of checking current element alone
- Never reset count when hitting a 0
- Started loop from `i=1` — skipped first element

---

## **Key Observation**

Only check current element. Increment count on 1, reset to 0 on anything else. Update max after every increment.

---

## **Final Approach**

1. `count = 0`, `maxCount = 0`
2. Loop from `i=0`
3. If `nums[i] == 1` → `count++`, update maxCount
4. Else → `count = 0`
5. Return maxCount

---

## **Dry Run**

```
nums = [1,1,0,1,1,1]

i=0 → 1, count=1, max=1
i=1 → 1, count=2, max=2
i=2 → 0, count=0
i=3 → 1, count=1, max=2
i=4 → 1, count=2, max=2
i=5 → 1, count=3, max=3

Output: 3 ✅
```

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(1) — no extra space

---

## **Revision Notes (30-second review)**

Loop through array. Count 1s, reset on 0. Track max after every increment. Return maxCount.

---

## **Similar Problems**

- LC 487 — Max Consecutive Ones II
- LC 1004 — Max Consecutive Ones III
- LC 283 — Move Zeroes
