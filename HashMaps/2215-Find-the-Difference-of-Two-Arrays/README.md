## **Problem Summary**

Return two lists: elements in nums1 not in nums2, and elements in nums2 not in nums1. No duplicates in result.

---

## **Initial Thought Process**

Iterate both arrays, remove common elements. Direction was right but logic was reversed — problem asks for elements NOT in the other array, not removing commons.

---

## **Mistakes / Struggles**

- Initially confused, thought about removing common elements instead of finding unique ones
- Didn't know `List<List<Integer>>` return syntax

---

## **Key Observation**

HashSet handles duplicates automatically. Add both arrays to separate sets, then check each set against the other. O(1) lookup per element.

---

## **Final Approach**

1. Add nums1 → set1, nums2 → set2
2. Loop set1 → if not in set2 → add to list1
3. Loop set2 → if not in set1 → add to list2
4. Add both lists to result, return

---

## **Dry Run**

```
nums1=[1,2,3], nums2=[2,4,6]

set1={1,2,3}, set2={2,4,6}

set1 vs set2: 1→not in set2✓, 2→in set2✗, 3→not in set2✓
list1=[1,3]

set2 vs set1: 2→in set1✗, 4→not in set1✓, 6→not in set1✓
list2=[4,6]

result=[[1,3],[4,6]] ✅
```

---

## **Pattern Used**

HashSet — Existence Check

---

## Complexity

**Time Complexity**
O(n+m) — adding to sets and checking existence

**Space Complexity**
O(n+m) — two sets

---

## **Java Notes**

- `Set<Integer> set = new HashSet<>()` — stores unique elements only
- `set.add(x)` — duplicates ignored automatically
- `set.contains(x)` — O(1) lookup
- `List<List<Integer>> result = new ArrayList<>()` — list of lists
- `result.add(list)` — add a list inside another list
- Enhanced for loop: `for(int num : set)` — cleaner iteration

---

## **Revision Notes (30-second review)**

Two HashSets remove duplicates. Check each set against other. Elements not found → add to result list. Return List of two lists.

---

## **Similar Problems**

- LC 349 — Intersection of Two Arrays
- LC 350 — Intersection of Two Arrays II
- LC 771 — Jewels and Stones
