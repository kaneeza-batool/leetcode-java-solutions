## **Problem Summary**

Reverse only the vowels in a string, keeping all other characters in place.

---

## **Initial Thought Process**

Two pointers opposite direction. Skip non-vowels, swap when both pointers land on vowels.

---

## **Mistakes / Struggles**

- Needed help with vowel check mechanism
- Forgot else branch for swap
- Forgot return statement

---

## **Key Observation**

Same structure as Valid Palindrome , skip invalid characters, act only when both pointers satisfy condition. String must be converted to `char[]` for in-place modification.

---

## **Final Approach**

1. Convert `s` to `char[]`
2. `i = 0`, `j = s.length()-1`
3. While `i < j`:
    - If `arr[i]` not vowel → `i++`
    - If `arr[j]` not vowel → `j--`
    - Else → swap, `i++`, `j--`
4. Return `new String(arr)`

---

## **Dry Run**

```
s = "hello"
arr = ['h','e','l','l','o']

i=0,j=4 → h not vowel → i++
i=1,j=4 → e vowel, o vowel → swap → ['h','o','l','l','e']
i=2,j=3 → l not vowel → i++
i=3,j=3 → i<j false, stop

Output: "holle" ✅
```

---

## **Pattern Used**

Two Pointers — Opposite Direction

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(n) — char array copy

---

## **Java Notes**

- `s.toCharArray()` — converts String to char[]
- `new String(arr)` — converts char[] back to String
- `vowels.indexOf(ch) != -1` — checks if ch is a vowel
- Strings are immutable in Java — always convert to char[] for modification

---

## **Revision Notes (30-second review)**

Convert to char[]. Two pointers. Skip non-vowels. Swap vowels. Return new String(arr).

---

## **Similar Problems**

- LC 125 — Valid Palindrome
- LC 344 — Reverse String
- LC 680 — Valid Palindrome II
