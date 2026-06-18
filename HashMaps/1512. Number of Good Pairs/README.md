## **Problem Summary**

Count pairs (i,j) where nums[i] == nums[j] and i < j.

---

## **Initial Thought Process**

Store frequencies in HashMap, then apply nC2 formula. Correct but overcomplicated.

---

## **Mistakes / Struggles**

- Overcomplicated with nC2 formula — simpler pattern exists
- Needed help seeing the incremental pair counting pattern

---

## **Key Observation**

When an element appears for the nth time, it forms exactly n-1 new pairs with all previous occurrences. Add current frequency to count before incrementing.

---

## **Final Approach**

1. `count = 0`, empty HashMap
2. For each element:
    - If exists in map → add current frequency to count, increment frequency
    - Else → add with frequency 1
3. Return count

---

## **Dry Run**

```
nums = [1,1,1,2]

num=1 → not in map → put {1:1}
num=1 → in map, count+=1=1, put {1:2}
num=1 → in map, count+=2=3, put {1:3}
num=2 → not in map → put {2:1}

return 3 ✅
```

---

## **Pattern Used**

HashMap — Frequency Count

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(n) — HashMap

---

## **Java Notes**

- `map.get(num) + 1` — increment existing value
- `map.containsKey()` before `map.get()` — avoid null pointer
- Enhanced for loop works cleanly for this pattern

---

## **Revision Notes (30-second review)**

HashMap tracks frequency. Each occurrence adds current frequency to count then increments. No formula needed.

---

## **Similar Problems**

- LC 771 — Jewels and Stones
- LC 1 — Two Sum
- LC 242 — Valid Anagram
