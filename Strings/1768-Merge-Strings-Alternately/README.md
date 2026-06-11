## **Problem Summary**

Merge two strings alternately character by character. If one string is longer, append remaining characters at the end.

---

## **Initial Thought Process**

Two pointers i and j for each word. Interleave characters. Append remaining characters of longer word at end.

---

## **Mistakes / Struggles**

- Used `word1[i]` instead of `word1.charAt(i)` — Strings are not arrays in Java
- Third while loop had `word1.length()` instead of `word2.length()` — copy-paste error
- No prior knowledge of StringBuilder — learned here

---

**Key Observation**
Two Input Pointers pattern. Main loop runs while both have characters. Two separate loops handle remaining characters of each word independently.

---

## **Final Approach**

1. `i = 0`, `j = 0`, `StringBuilder sb`
2. While both words have characters: append `word1.charAt(i)` and `word2.charAt(j)`, advance both
3. While word1 has remaining: append `word1.charAt(i)`, `i++`
4. While word2 has remaining: append `word2.charAt(j)`, `j++`
5. Return `sb.toString()`

---

## **Dry Run**

```
word1 = "abc", word2 = "pqr"

i=0,j=0 → append a,p
i=1,j=1 → append b,q
i=2,j=2 → append c,r
both exhausted

Output: "apbqcr" ✅
```

---

## **Pattern Used**

Two Pointers — Two Input Pointers

---

## Complexity

**Time Complexity**
O(n + m) — n and m are lengths of word1 and word2

**Space Complexity**
O(n + m) — StringBuilder stores full result

---

## **Java Notes**

- `String` characters accessed via `.charAt(i)`, not `[i]`
- `String.length()` has parentheses — it's a method, not a property
- `StringBuilder` — mutable string builder: `new StringBuilder()`, `.append(ch)`, `.toString()`
- Always double check loop conditions when copy-pasting similar while loops

---

## **Revision Notes (30-second review)**

Two pointers, one per word. Interleave in main loop. Two separate loops for remainders. StringBuilder to build result. Return toString().

---

## **Similar Problems**

- LC 88 — Merge Sorted Array
- LC 1470 — Shuffle the Array
- LC 344 — Reverse String
