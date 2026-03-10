# 242. Valid Anagram (Java - HashMap with getOrDefault)

## Problem

Given two strings **s** and **t**, return **true** if `t` is an **anagram** of `s`, otherwise return **false**.

### Example 1

Input

s = "anagram"
t = "nagaram"


Output

true


---

### Example 2

Input

s = "rat"
t = "car"


Output

false


---

# What is an Anagram?

Two strings are **anagrams** if:

- They contain the **same characters**
- Each character appears the **same number of times**
- **Order does not matter**

Example:


anagram
nagaram


Both contain:

| Character | Count |
|-----------|------|
| a | 3 |
| n | 1 |
| g | 1 |
| r | 1 |
| m | 1 |

---

# Idea

We compare the **frequency of characters** in both strings.

Example


s = anagram
t = nagaram


Character counts should be the same.

We use a **HashMap**


character → count


Example map:


{a=3, n=1, g=1, r=1, m=1}


---

# Approach

1. If lengths are different → return **false**
2. Create a **HashMap**
3. Traverse string **s**
    - Increase frequency using `getOrDefault()`
4. Traverse string **t**
    - Decrease frequency
    - If character not found → return **false**
5. If all counts match → return **true**

---
---

## Dry Run

### Input


s = "anagram"
t = "nagaram"


### Step 1: Count Characters from `s`

We store the frequency of each character in a **HashMap**.

| Character | Action | HashMap |
|-----------|--------|---------|
| a | add → 1 | {a=1} |
| n | add → 1 | {a=1, n=1} |
| a | add → 2 | {a=2, n=1} |
| g | add → 1 | {a=2, n=1, g=1} |
| r | add → 1 | {a=2, n=1, g=1, r=1} |
| a | add → 3 | {a=3, n=1, g=1, r=1} |
| m | add → 1 | {a=3, n=1, g=1, r=1, m=1} |

Final HashMap after processing `s`


{a=3, n=1, g=1, r=1, m=1}


---

### Step 2: Reduce Count using `t`

Now we traverse string `t` and decrease the frequency.

| Character | Action | HashMap |
|-----------|--------|---------|
| n | subtract → 0 | {a=3, n=0, g=1, r=1, m=1} |
| a | subtract → 2 | {a=2, n=0, g=1, r=1, m=1} |
| g | subtract → 0 | {a=2, n=0, g=0, r=1, m=1} |
| a | subtract → 1 | {a=1, n=0, g=0, r=1, m=1} |
| r | subtract → 0 | {a=1, n=0, g=0, r=0, m=1} |
| a | subtract → 0 | {a=0, n=0, g=0, r=0, m=1} |
| m | subtract → 0 | {a=0, n=0, g=0, r=0, m=0} |

---

### Final HashMap


{a=0, n=0, g=0, r=0, m=0}


All values are **0**, so the strings are **anagrams**.

### Result


true

---

## Time Complexity


O(n)


We traverse the strings once to count and update the character frequencies.

---

## Space Complexity


O(k)


Where **k** is the number of **unique characters** stored in the HashMap.

For this problem, since the input contains only **lowercase English letters**,  
`k` can be at most **26**.

---