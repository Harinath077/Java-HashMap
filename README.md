# Finding Frequency of Characters in a String using HashMap (Java)

## Problem Statement

Given a string, find the **frequency (number of occurrences)** of each character.

### Example

**Input**

aabcc

**Output**

a → 2  
b → 1  
c → 2

---

# What is Frequency?

**Frequency** means **how many times something appears**.

Example string:

aabcc

Count each character:

| Character | Count |
|-----------|------|
| a | 2 |
| b | 1 |
| c | 2 |

So we say:

Frequency of 'a' = 2  
Frequency of 'b' = 1  
Frequency of 'c' = 2

---

# Why Use HashMap?

We need a structure that can store:

character → count

Example:

a → 2  
b → 1  
c → 2

A **HashMap** is perfect for this because it stores **key-value pairs**.

key → character  
value → frequency

Example HashMap representation:

{a=2, b=1, c=2}

---

# Test Case Used

Input String:

aabcc

---

# Approach

1. Create a **HashMap**.
2. Traverse each character in the string.
3. Update the frequency of the character.
4. Store the result in the HashMap.

---

# Important Method Used

We use:

getOrDefault()

### What it does

map.getOrDefault(key, defaultValue)

If the key exists → return its value.  
If the key does not exist → return the default value.

This helps us **avoid writing extra conditions**.

---

# Step-by-Step Execution

### Input String

aabcc

### Initial HashMap

{}

---

### Step 1

Character: a

getOrDefault('a', 0) → 0

New value:

0 + 1 = 1

Updated HashMap:

{a=1}

---

### Step 2

Character: a

getOrDefault('a', 0) → 1

New value:

1 + 1 = 2

Updated HashMap:

{a=2}

---

### Step 3

Character: b

getOrDefault('b', 0) → 0

New value:

0 + 1 = 1

Updated HashMap:

{a=2, b=1}

---

### Step 4

Character: c

getOrDefault('c', 0) → 0

New value:

0 + 1 = 1

Updated HashMap:

{a=2, b=1, c=1}

---

### Step 5

Character: c

getOrDefault('c', 0) → 1

New value:

1 + 1 = 2

---

# Final HashMap

{a=2, b=1, c=2}

---

# Time Complexity

O(n)

We traverse the string once, so the time complexity is **linear**.

---

# Space Complexity

O(k)

Where **k = number of unique characters** in the string.

---

# Final Output

a → 2  
b → 1  
c → 2