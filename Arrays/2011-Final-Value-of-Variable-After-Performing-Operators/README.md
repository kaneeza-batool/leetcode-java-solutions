## Problem

There is a programming language with only **four** operations and **one** variable `X`:

- `++X` and `X++` **increments** the value of the variable `X` by `1`.
- `-X` and `X--` **decrements** the value of the variable `X` by `1`.

Initially, the value of `X` is `0`.

Given an array of strings `operations` containing a list of operations, return *the **final** value of* `X` *after performing all the operations*.

**Example 1:**

```
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.

```

**Example 2:**

```
Input: operations = ["++X","++X","X++"]
Output: 3
Explanation:The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.

```

**Example 3:**

```
Input: operations = ["X++","++X","--X","X--"]
Output: 0
Explanation: The operations are performed as follows:
Initially, X = 0.
X++: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
--X: X is decremented by 1, X = 2 - 1 = 1.
X--: X is decremented by 1, X = 1 - 1 = 0.

```

**Constraints:**

- `1 <= operations.length <= 100`
- `operations[i]` will be either `"++X"`, `"X++"`, `"--X"`, or `"X--"`

## **Approach:**

- Initialise x as 0
- Loop through every operation in the array
- If the operation is "X++" or "++X", increment x
- Otherwise, decrement x
- Return x

## **Mistakes:**

- Used `==` instead of `.equals()` for String comparison — `==` compares memory references in Java, not actual string content. Always use `.equals()` for Strings.
- Unnecessary extra parentheses inside the `if` condition — not a bug but messy style

**`==` vs `.equals()` in Java:**

- `==` compares memory references — checks if two variables point to the same object in memory
- `.equals()` compares actual content — checks if two objects have the same value
- Primitives (`int`, `char`, `boolean`) → use `==`
- Strings and objects → always use `.equals()`
- Two strings can have identical content but be different objects in memory — `==` returns `false`, `.equals()` returns `true`

## **Complexity:**

- Time: O(n) — single pass through the array
- Space: O(1) — only one integer variable used
