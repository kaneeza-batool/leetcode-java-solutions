## **Problem Summary**

Given names and heights arrays, return names sorted in descending order of height.

---

## **Initial Thought Process**

HashMap with height as key and name as value. Sort heights, look up names. Height as key works because heights are unique.

---

## **Mistakes / Struggles**

- Built map after sorting — heights and names misaligned
- Used `int[] result` instead of `String[] result`
- Used `Array.sort()` instead of `Arrays.sort()`
- Wrong result index formula — used `i-1-heights.length` instead of `heights.length-1-i`
- Tried `Collections.reverseOrder()` on primitive `int[]` — only works on `Integer[]`
- Missing semicolons

---

## **Key Observation**

Build map before sorting. Heights are unique so height→name mapping is safe. Sort ascending, loop backwards, use `heights.length-1-i` as result index.

---

## **Final Approach**

1. Build `map` — height→name
2. `Arrays.sort(heights)` — ascending
3. Loop from end to start
4. `result[heights.length-1-i] = map.get(heights[i])`
5. Return result

---

## **Dry Run**

```
names=["Mary","John","Emma"], heights=[180,165,170]

map={180:"Mary", 165:"John", 170:"Emma"}
sorted heights=[165,170,180]

i=2 → result[0]=map.get(180)="Mary"
i=1 → result[1]=map.get(170)="Emma"
i=0 → result[2]=map.get(165)="John"

Output: ["Mary","Emma","John"] ✅
```

---

## **Pattern Used**

HashMap + Sorting

---

## Complexity

**Time Complexity**
O(n log n) — sorting dominates

**Space Complexity**
O(n) — HashMap and result array

---

## **Java Notes**

- `Arrays.sort()` — correct, not `Array.sort()`
- `Collections.reverseOrder()` only works on `Integer[]` not `int[]`
- Always build map before sorting to preserve original index relationships
- Reverse loop index formula: `result[n-1-i]`

---

## **Revision Notes (30-second review)**

Map height→name first. Sort heights ascending. Loop backwards. result[n-1-i] = map.get(heights[i]).

---

## **Similar Problems**

- LC 1122 — Relative Sort Array
- LC 791 — Custom Sort String
