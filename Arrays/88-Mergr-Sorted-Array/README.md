## Problem

You are given two integer arrays `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

**Merge** `nums1` and `nums2` into a single array sorted in **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be *stored inside the array* `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

**Example 1:**

```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

```

**Example 2:**

```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

```

**Example 3:**

```
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

```

**Constraints:**

- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `109 <= nums1[i], nums2[j] <= 109`

## **Approach (Btute Force):**

- Loop through `nums2` and copy each element into `nums1` starting at index `m`
- Sort `nums1` using `Arrays.sort()`
- Return is implicit — `nums1` is modified in-place

## **Mistakes:**

- No bugs. Straightforward implementation.
- Optimal solution exists using three pointers from the back — merging in O(m+n) without sorting — but this brute force is acceptable for now.

You are given two sorted arrays. nums1 has extra space at the end to hold elements of nums2. You must merge both arrays into nums1 in sorted order, **in-place**.

## Solution (Brute Force)

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0; i<n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
```

## Complexity

Time: 0((m+n)log(m+n)) — Determined by Arrays.sort

Space: 0(1) — No extra array created

## Approach

- Set pointer `i` to the last valid element of `nums1` (index `m - 1`).
- Set pointer `j` to the last element of `nums2` (index `n - 1`).
- Set pointer `k` to the last index of `nums1` (index `m + n - 1`).
- While both `i` and `j` are greater than or equal to 0:
    - If `nums1[i]` is greater than `nums2[j]`:
        - Place `nums1[i]` at position `k`.
        - Move `i` one step left.
    - Otherwise:
        - Place `nums2[j]` at position `k`.
        - Move `j` one step left.
    - Move `k` one step left.
- If any elements remain in `nums2`:
    - Copy them into `nums1` starting from index `k`.
- Stop when all elements are merged.

## Mistakes

- Youtube helped, I understood and implemented it

## Solution

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // last element in nums1
        int j = n - 1;        // last element in nums2
        int k = m + n - 1;    // last position in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

```

## Time and Space Complexity

- Time: O(m+n) — Single pass through both arrays
- Space: O(1) — Everything done in-place
