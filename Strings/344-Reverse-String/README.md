## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array [in-place](https://en.wikipedia.org/wiki/In-place_algorithm) with `O(1)` extra memory.

**Example 1:**

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

**Example 2:**

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

**Constraints:**

- `1 <= s.length <= 105`
- `s[i]` is a [printable ascii character](https://en.wikipedia.org/wiki/ASCII#Printable_characters).

## Approach

- Use two pointers `i` at start and `j` at end
- Swap `s[i]` and `s[j]` using a temp variable
- Move `i` forward and `j` backward
- Repeat until pointers cross

## Mistakes

- Declared `temp` as `int` instead of `char` — the array is `char[]` so temp must be `char` to store the character correctly. `int` would store the ASCII value, not the character itself.

## Solution

```java
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while (i<j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
```

## Time and Space Complexity

- Time: O(n) — Single pass through the array
- Space: O(1) — In-place swap, no extra structure
