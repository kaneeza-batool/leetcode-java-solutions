## Problem

Write an algorithm to determine if a number `n` is happy.

A **happy number** is a number defined by the following process:

- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it **loops endlessly in a cycle** which does not include 1.
- Those numbers for which this process **ends in 1** are happy.

Return `true` *if* `n` *is a happy number, and* `false` *if not*.

**Example 1:**

```
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
```

**Example 2:**

```
Input: n = 2
Output: false
```

**Constraints:**

- `1 <= n <= 231 - 1`

## Approach

- Treat the transformation "sum of squares of digits" as a function.
- Use **Floyd's Cycle Detection Algorithm (Tortoise and Hare)**:
    - `slow` moves one step at a time.
    - `fast` moves two steps at a time.
- If the number is happy, `fast` will eventually reach `1`.
- If the number is not happy, the sequence enters a cycle, and `slow` and `fast` will eventually meet.
- Return `true` if `fast == 1`, otherwise `false`.

## **Mistakes:**

- Accidentally updated `slow` twice instead of updating `fast`:

```
slow=sumOfSquaresOfDigits(slow);
slow=sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast));
```

instead of:

```
slow=sumOfSquaresOfDigits(slow);
fast=sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast));
```

- Because `fast` never changed, the loop condition never became false, causing a **Time Limit Exceeded (TLE)** error.
- Used `Math.pow(digit, 2)` initially, which is slower and unnecessary for squaring a digit. Replaced it with `digit * digit`.

## **Solution:**

```java
class Solution {
    private int sumOfSquaresOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquaresOfDigits(slow);
            fast = sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast));
        } while (slow != fast);

        return slow == 1;
    }
}
```

## **Complexity:**

- **Time Complexity:** O(logn)
- **Space Complexity:** O(1)

## Dry Run:

Input:

```
n = 19
```

Sequence:

```
19
→ 82
→ 68
→ 100
→ 1
```

Pointers:

```
slow = 19, fast = 19

slow = 82
fast = 68

slow = 68
fast = 1

slow = 100
fast = 1

slow = 1
fast = 1
```

Since both pointers meet at `1`, the number is happy.

Output:

```
true
```
