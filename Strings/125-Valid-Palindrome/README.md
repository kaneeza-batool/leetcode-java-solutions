## **Problem Summary**

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring case.  (Two pointers-Opposite approach)

---

## **Initial Thought Process**

Two pointers from both ends, compare characters, move inward. Initially, I missed the alphanumeric filtering and case handling.

---

## **Mistakes / Struggles**

- Forgot to filter non-alphanumeric characters initially
- Passed index `i` instead of `s.charAt(i)` to `Character.isLetterOrDigit()`
- Tried calling `.lowerCase()` on `char` — primitives don't have methods
- Tried `.equals()` on `char` — primitives don't have methods, use `==.`
- `j--` direction confused initially (was writing `j++`)

---

## **Key Observation**

Skip non-alphanumeric characters before comparing. Only compare when both pointers are sitting on valid characters.

---

## **Final Approach**

1. Initialize `i = 0`, `j = s.length() - 1`
2. While `i < j`:
    - If `s.charAt(i)` not alphanumeric → `i++`
    - If `s.charAt(j)` not alphanumeric → `j--`
    - Else compare both after `toLowerCase` → if equal move both, else return false
3. Return true

---

## Solution

```java
class Solution {
    public boolean isPalindrome(String s) {
    
    int i=0;
    int j=s.length()-1;
        
    while (i<j) {
        if (!Character.isLetterOrDigit(s.charAt(i))) {
            i++;
        }
        else if (!Character.isLetterOrDigit(s.charAt(j))) {
            j--;
        }
        else if (Character.toLowerCase(s.charAt(i)) ==  Character.toLowerCase(s.charAt(j))) {
            i++;
            j--;
        }
        else {
            return false;
        }
    }
    return true;
    }
}
```

---

## **Dry Run**

```
Input: "A man, a plan, a canal: Panama"

i=0  j=29  → A vs a → equal → i++, j--
i=1  j=28  → ' ' skipped → i++
i=2  j=28  → m vs m → equal → i++, j--
... continues until i >= j
return true
```

---

## Complexity

**Time Complexity**
O(n) — single pass through the string

**Space Complexity**
O(1) — no extra data structure used

---

## **Revision Notes (30-second review)**

Two pointers from both ends. Skip non-alphanumeric. Compare lowercase chars. Move inward if equal, return false if not.

---

## **Similar Problems**

- LC 234 — Palindrome Linked List
- LC 680 — Valid Palindrome II
- LC 9 — Palindrome Number
