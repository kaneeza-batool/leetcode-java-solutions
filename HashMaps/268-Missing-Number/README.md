## **Problem Summary**

Given array of n distinct numbers in range [0,n], find the missing number.

---

## **Initial Thought Process**
Two approaches:

Approach 1 — subtract each element from expected sum. Approach 2 — XOR all elements and range. Chose Approach 1.

---

## **Mistakes / Struggles**

- None. Clean solve.

---

## **Key Observation**

Expected sum of range [0,n] = n*(n+1)/2. Subtract each element from expected sum. Remainder is the missing number.

---

## **Final Approach**

1. `sumOfRange = n*(n+1)/2`
2. Loop through array, subtract each element
3. Return remaining sum

---

## **Dry Run**

```
nums = [3,0,1], n=3

sumOfRange = 3*4/2 = 6
6 - 3 = 3
3 - 0 = 3
3 - 1 = 2

return 2 ✅
```

---

## **Pattern Used**

Math — Gauss Formula

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(1) — no extra space

---

## **Java Notes**

- `n*(n+1)/2` — integer division, works correctly here since result is always whole number
- Modify sumOfRange directly instead of creating separate variable

---

## **Revision Notes (30-second review)**

Expected sum = n*(n+1)/2. Subtract all elements. Return remainder.

---

## **Similar Problems**

- LC 136 — Single Number
- LC 287 — Find the Duplicate Number
- LC 41 — First Missing Positive

