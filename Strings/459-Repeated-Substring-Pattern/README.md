## **Problem Summary**

Check if string s can be formed by repeating a substring multiple times.

---

## **Initial Thought Process**

Loop till s.length()-1 and check if pattern repeats. Didn't know how to implement the check.

---

## **Mistakes / Struggles**

- Didn't know `substring()` and `repeat()` methods
- Couldn't implement pattern check independently — looked up solution

---

## **Key Observation**

If pattern length `i` divides `n` evenly, repeat `substring(0, i)` exactly `n/i` times and check if it equals `s`.

---

## **Final Approach**

1. Loop `i` from 1 to `n/2`
2. If `n % i == 0` → extract pattern via `substring(0, i)`
3. Repeat pattern `n/i` times
4. If equals `s` → return true
5. Return false

---

## **Dry Run**

```
s = "abab", n=4

i=1 → "a".repeat(4) = "aaaa" ≠ "abab"
i=2 → "ab".repeat(2) = "abab" = "abab" ✅

return true
```

---

## **Pattern Used**

String — Substring + Pattern Matching

---

## Complexity

**Time Complexity**
O(n²) — outer loop O(n), string comparison O(n)

**Space Complexity**
O(n) — StringBuilder

---

## **Java Notes**

- `s.substring(0, i)` — extracts characters from index 0 to i-1
- `"ab".repeat(3)` — returns "ababab"
- `n % i == 0` — checks if i divides n evenly

---

## **Revision Notes (30-second review)**

Loop pattern lengths 1 to n/2. If divisible, extract and repeat. Compare with original. Return true if match found.

---

## **Similar Problems**

- LC 686 — Repeated String Match
- LC 796 — Rotate String
