## **Problem Summary**

For each element in nums1, find the next greater element in nums2 to its right. Return -1 if none exists.

---

## **Initial Thought Process**

Store nums1 elements in HashMap, find element in nums2, scan right for first greater. Correct direction but O(n²).

---

## **Mistakes / Struggles**

- Initial approach only checked immediate next element — missed non-adjacent greater elements
- Mixed up variable name `mp` and `map`
- Needed help with stack pop + map logic
- Needed help building Part 3

---

## **Key Observation**

Stack tracks elements waiting for their next greater. When current element is greater than stack top, that top has found its answer. Remaining stack elements after loop get -1.

---

## **Final Approach**

1. Create HashMap and Stack
2. Loop through nums2:
    - While stack not empty AND current > top → pop, map popped→current
    - Push current onto stack
3. Remaining stack elements → map to -1
4. Build result by looking up each nums1 element in map
5. Return result

---

## **Dry Run**

```
nums2 = [1,3,4,2]

i=0 → stack empty, push 1 → [1]
i=1 → 3>1, pop 1, map 1→3, push 3 → [3]
i=2 → 4>3, pop 3, map 3→4, push 4 → [4]
i=3 → 2<4, push 2 → [4,2]

remaining: map 4→-1, map 2→-1

nums1=[1,3] → result=[3,4] ✅
```

---

## **Pattern Used**

Monotonic Stack + HashMap

---

## Complexity

**Time Complexity**
O(n+m) — n for nums2, m for nums1

**Space Complexity**
O(n) — stack and map

---

## **Java Notes**

- `Stack<Integer> stack = new Stack<>()`
- `stack.push(x)` — add to top
- `stack.pop()` — remove and return top
- `stack.peek()` — view top without removing
- `stack.isEmpty()` — check if empty
- Always be consistent with variable names

---

## **Revision Notes (30-second review)**

Stack tracks unresolved elements. Current greater than top → pop and map. After loop, remaining → map to -1. Look up nums1 in map for result.

---

## **Similar Problems**

- LC 503 — Next Greater Element II
- LC 739 — Daily Temperatures
- LC 84 — Largest Rectangle in Histogram
