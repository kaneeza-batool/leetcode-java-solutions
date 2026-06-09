## **Problem Summary**

Given a string array of operations, increment or decrement x starting from 0. Return final value.

---

## **Initial Thought Process**

Initialize x = 0. Loop through operations. Check if operation is increment or decrement. Return x.

---

## **Mistakes / Struggles**

- Used “==” instead of .equals()

---

## **Key Observation**

Only two outcomes — increment or decrement. Else branch handles decrement automatically since no other operations exist.

---

## **Final Approach**

1. Initialize `X = 0`
2. Loop through operations
3. If `"++X"` or `"X++"` → `X++`
4. Else → `X--`
5. Return X

---

## **Dry Run**

```
operations = ["--X", "X++", "X++"]

i=0 → "--X" → X = -1
i=1 → "X++" → X = 0
i=2 → "X++" → X = 1

return 1
```

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(1) — no extra space

---

## **Revision Notes (30-second review)**

Loop through operations. equals() for String comparison. Increment or decrement x. Return x.

---

## **Similar Problems**

- LC 1480 — Running Sum of 1D Array
- LC 58 — Length of Last Word
