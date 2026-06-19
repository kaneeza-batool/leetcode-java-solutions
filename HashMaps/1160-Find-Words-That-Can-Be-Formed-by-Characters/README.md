## **Problem Summary**

Given a string `chars` and array of words, return total length of words that can be formed using characters in `chars`. Each character can only be used once.

---

## **Initial Thought Process**

Build frequency map from chars. For each word, check if all characters exist with sufficient frequency.

---

## **Mistakes / Struggles**

- Used `Map<String, Integer>` instead of `Map<Character, Integer>` for wordMap
- Tried validation before building wordMap

---

## **Key Observation**

Build fresh wordMap per word. Compare frequencies, if any character in wordMap has higher frequency than charMap, word is invalid. Use `getOrDefault` to handle missing keys cleanly.

---

## **Final Approach**

1. Build `charMap` from chars string
2. For each word:
    - Build `wordMap` from word
    - Loop through wordMap keys
    - If `wordMap.get(c) > charMap.getOrDefault(c, 0)` → invalid
    - If valid → add word.length() to result
3. Return result

---

## **Dry Run**

```
chars = "atach", words = ["cat","bt"]
charMap = {a:2, t:1, c:1, h:1}

word="cat" → wordMap={c:1,a:1,t:1}
c:1 <= 1 ✓, a:1 <= 2 ✓, t:1 <= 1 ✓ → valid, result+=3

word="bt" → wordMap={b:1,t:1}
b:1 > charMap.getOrDefault(b,0)=0 → invalid

return 3 ✅
```

---

## **Pattern Used**

HashMap — Frequency Comparison

---

## Complexity

**Time Complexity**
O(n*m) — n words, m average word length

**Space Complexity**
O(1) — map size bounded by 26 characters

---

## **Java Notes**

- `map.getOrDefault(key, 0)` — returns value if exists, else returns 0. Cleaner than containsKey check
- `map.keySet()` — returns all keys in map
- `word.toCharArray()` — converts String to char array for iteration
- Always use `Map<Character, Integer>` not `Map<String, Integer>` for character frequency maps

---

## **Revision Notes (30-second review)**

Build charMap once. Per word build wordMap. Compare frequencies using getOrDefault. Add length if valid.

---

## **Similar Problems**

- LC 242 — Valid Anagram
- LC 383 — Ransom Note
- LC 49 — Group Anagrams
