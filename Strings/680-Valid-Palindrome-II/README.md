## Problem

Given a string `s`, return `true` *if the* `s` *can be palindrome after deleting **at most one** character from it*.

**Example 1:**

```
Input: s = "aba"
Output: true
```

**Example 2:**

```
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
```

**Example 3:**

```
Input: s = "abc"
Output: false
```

**Constraints:**

- `1 <= s.length <= 105`
- `s` consists of lowercase English letters.

## Approach

- Use two pointers `i` at start and `j` at end
- If characters match, move both pointers inward
- If mismatch found, try two options using a helper function:
    - Skip left character: check if `s[i+1...j]` is a palindrome
    - Skip right character: check if `s[i...j-1]` is a palindrome
- If either returns `true`, the string is a valid palindrome with one deletion
- Helper function does a standard two-pointer palindrome check on a substring
- If no mismatch found at all, return `true`

## Mistakes

- Modified variables inside function call using `++i` and `-j`, which changed original values and broke logic
- Did not keep both palindrome checks independent (second check used already modified `i`)
- Incorrectly evaluated both cases (skip left and skip right) due to side effects on variables
- Introduced hidden bug by using pre-increment/decrement operators in arguments instead of passing `i + 1` and `j - 1`

## Solution

```java
class Solution {
    public boolean palindromeHelper(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (left != right) {
                return (palindromeHelper(i+1, j, s) || palindromeHelper(i, j-1, s));
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
```

## Time and Space Complexity

- **Time: O**(n) — One pass in main function, helper is also 0(n) in worst case
- **Space**: O(1) — No extra structure used
