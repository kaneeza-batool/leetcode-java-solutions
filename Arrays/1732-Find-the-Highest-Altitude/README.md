## **Problem Summary**

Given a gain array representing altitude changes, find the highest altitude reached. Starting altitude is 0.

---

## **Initial Thought Process**

Create altitude array of size `gain.length + 1`. First element is 0. Each altitude = previous altitude + current gain. Track max while building.

---

## **Mistakes / Struggles**

- Initially said "add element i and i+1 from gain array", wrong formula. Altitude uses previous altitude + current gain, not gain + gain.
    - Formula is always `altitude[i] = altitude[i-1] + gain[i-1]`, not gain + gain
- Named array `altitudes` but wrote `altitude` inside loop — typo causing compilation error

---

## **Key Observation**

Same pattern as Running Sum,  each element depends on the previous one. Starting altitude is 0 so initialize max = 0, not Integer.MIN_VALUE.

---

## **Final Approach**

1. Create `altitudes[]` of size `gain.length + 1`
2. `altitudes[0] = 0` (default)
3. Loop from `i = 1`: `altitudes[i] = altitudes[i-1] + gain[i-1]`
4. Track max inside loop
5. Return max

---

## **Dry Run**

```
gain = [-5, 1, 5, 0, -7]

altitudes[0] = 0
altitudes[1] = 0 + (-5) = -5
altitudes[2] = -5 + 1 = -4
altitudes[3] = -4 + 5 = 1
altitudes[4] = 1 + 0 = 1
altitudes[5] = 1 + (-7) = -6

max = 1
```

---

## Complexity

**Time Complexity**
O(n) — single pass

**Space Complexity**
O(n) — extra altitude array of size n+1

---

## **Revision Notes (30-second review)**

Altitude array size = gain.length + 1. Start at 0. Each element = previous altitude + current gain. Track max inside loop.

---

## **Similar Problems**

- LC 1480 — Running Sum of 1D Array
- LC 303 — Range Sum Query
- LC 724 — Find Pivot Index
