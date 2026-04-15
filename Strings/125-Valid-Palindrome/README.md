## Problem

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a **palindrome**, or* `false` *otherwise*.

**Example 1:**

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

**Example 2:**

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

**Example 3:**

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

**Constraints:**

- `1 <= s.length <= 2 * 105`
- `s` consists only of printable ASCII characters.

## Approach

- Use two pointers `i` at start and `j` at end of string
- Skip non-alphanumeric characters by checking with `Character.isLetterOrDigit()` and using `continue` to move the pointer without comparing
- Compare left and right characters after converting both to lowercase using `Character.toLowerCase()`
- If mismatch found, return `false` immediately
- If pointers cross without mismatch, return `true`

## **New Methods Used:**

- `s.charAt(i)` — returns character at index `i` in a String
- `Character.isLetterOrDigit(c)` — returns `true` if character is a letter or digit, `false` otherwise
- `Character.toLowerCase(c)` — converts a character to lowercase for case-insensitive comparison

## Mistakes

- Forgot `continue` after skipping non-alphanumeric characters — without it, the code falls through and compares invalid characters
- All methods above were new — had to learn them fresh

## Solution

```java
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}

```

## Time and Space Complexity

- Time: O(n) — Single pass through the string
- Space: O1n) — No extra data structure used
