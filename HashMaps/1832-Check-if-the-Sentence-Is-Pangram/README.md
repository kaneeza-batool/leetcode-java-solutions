## **Problem Summary**

Check if a sentence contains every letter of the alphabet at least once.

---

## **Initial Thought Process**

Add characters to HashSet, check if all 26 letters present. Correct direction but confused containsKey() with contains().

---

## **Mistakes / Struggles**

- Used `set.containsKey()` — that's HashMap. HashSet uses `set.contains()`
- Used `sentence.toArray()` — doesn't exist. Correct is `sentence.toCharArray()`
- Stored result as `char` instead of `char[]`
- Loop condition `i < 25` — missed last character

---

## **Key Observation**

HashSet automatically ignores duplicates. If all 26 letters exist in sentence, set size will be exactly 26. One size check replaces complex validation.

---

## **Final Approach**

1. Convert sentence to `char[]`
2. Add each character to HashSet
3. Return `set.size() == 26`

---

## **Dry Run**

```
sentence = "thequickbrownfoxjumpsoverthelazydog"

After loop: set contains all 26 letters
set.size() == 26 → true ✅
```

---

## **Pattern Used**

HashSet — Existence + Count Check

---

## Complexity

**Time Complexity**
O(n) — single pass through sentence

**Space Complexity**
O(1) — set bounded by 26 characters

---

## **Java Notes**

- `sentence.toCharArray()` → returns `char[]`, no arguments
- `char[] arr` not `char arr` for array storage
- HashSet → `set.contains()`, HashMap → `map.containsKey()`
- `set.size() == 26` — elegant way to check all letters present

---

## **Revision Notes (30-second review)**

Add all chars to HashSet. Return set.size() == 26.

---

## **Similar Problems**

- LC 242 — Valid Anagram
- LC 1160 — Find Words Formed by Characters
- LC 387 — First Unique Character in String
