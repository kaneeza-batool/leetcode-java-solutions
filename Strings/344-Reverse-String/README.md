## **Problem Summary**

Reverse a character array in-place.

---

## **Initial Thought Process**

Two pointers opposite direction. Swap from both ends moving inward.

---

## **Mistakes / Struggles**

- Forgot `i++` and `j--` inside loop that causes infinite loop

---

## **Key Observation**

Classic opposite direction two pointers. Swap and move both pointers inward until they meet.

---

**Final Approach**

1. `i = 0`, `j = s.length - 1`
2. While `i < j`: swap `s[i]` and `s[j]`, `i++`, `j--`

---

## **Dry Run**

```
s = ['h','e','l','l','o']

i=0,j=4 → swap h,o → ['o','e','l','l','h']
i=1,j=3 → swap e,l → ['o','l','l','e','h']
i=2,j=2 → i<j false, stop

Output: ['o','l','l','e','h'] ✅
```

---

## **Pattern Used**

Two Pointers — Opposite Direction

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(1) — in-place

---

## **Java Notes**

- `char[]` uses `.length` not `.length()` — it's an array not a String
- Always include pointer movement inside while loop or it runs forever

---

## **Revision Notes (30-second review)**

i=0, j=end. Swap, i++, j--. Stop when i>=j.

---

## **Similar Problems**

- LC 125 — Valid Palindrome
- LC 541 — Reverse String II
- LC 345 — Reverse Vowels of a String
