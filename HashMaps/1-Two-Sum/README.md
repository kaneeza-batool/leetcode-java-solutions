## **Problem Summary**

Given an array and a target, return indices of two numbers that add up to target.

---

## **Initial Thought Process**

Use HashMap. For each element, calculate difference between target and current element. If difference exists in map, return both indices. Else store current element and index in map.

---

## **Mistakes / Struggles**

- Used `Map<int, int>` instead of `Map<Integer, Integer>` — primitives not allowed in generics
- Missing semicolon after `mp.put()`
- Didn't know return syntax for two indices

---

## **Key Observation**

HashMap gives O(1) lookup. Instead of nested loops checking every pair, store each element as you go and check if its complement already exists.

---

## **Final Approach**

1. Create `Map<Integer, Integer>`
2. Loop through array
3. `diff = target - nums[i]`
4. If `map.containsKey(diff)` → return `{map.get(diff), i}`
5. Else → `map.put(nums[i], i)`
6. Return empty array if no solution

---

## **Dry Run**

```
nums = [2,7,11,15], target = 9

i=0 → diff=7, map empty → put {2:0}
i=1 → diff=2, map has 2 → return {0,1} ✅
```

---

## **Pattern Used**

HashMap — Complement Lookup

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(n) — HashMap stores up to n elements

---

## **Java Notes**

- `Map<Integer, Integer> mp = new HashMap<>()` — correct declaration
- Generics require wrapper classes: `Integer` not `int`, `Character` not `char`
- `map.put(key, value)` — store
- `map.containsKey(key)` — check existence
- `map.get(key)` — retrieve value
- `return new int[]{a, b}` — return two values as array

---

## **Revision Notes (30-second review)**

HashMap stores element→index. For each element, check if complement exists in map. If yes return both indices. If no, store current. O(n) time.

---

## **Similar Problems**

- LC 167 — Two Sum II
- LC 15 — 3Sum
- LC 771 — Jewels and Stones
