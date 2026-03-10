# Two Sum (HashMap – One Pass)

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the **indices of the two numbers such that they add up to the target**.

You may assume that each input has **exactly one solution**, and you **may not use the same element twice**.

---

# Test Case

### Example

Input

nums = [2,7,11,15]  
target = 9

Output

[0,1]

Explanation

nums[0] + nums[1] = 2 + 7 = 9

---

# Core Idea

For every number, we calculate the **complement**.


complement = target - current_number


Then we check:

- If the **complement already exists** in a HashMap
- If it exists → we found the answer

The HashMap stores:


number → index


---

### Simple Example

target = 9

Array


[2,7]


Step 1  
Number = 2


complement = 9 - 2 = 7


7 is not seen yet → store 2 in the map


{2 → index 0}


---

Step 2  
Number = 7


complement = 9 - 7 = 2


2 already exists in the map.

So we found the answer.


[0,1]


---

# Algorithm

1. Create an empty **HashMap**
2. Traverse the array
3. For each number:
    - Compute the **complement**


complement = target - nums[i]


4. Check if complement exists in the map
5. If it exists → return the indices
6. Otherwise store the current number and index in the map

---

# Step-by-Step Idea

Example

nums = [2,7,11,15]  
target = 9

| Number | Complement | Action |
|------|------|------|
| 2 | 7 | Store in map |
| 7 | 2 | Found in map → solution |

---
# Complete Dry Run

Input

nums = [3,2,4]  
target = 6

Initial HashMap


{}


---

### Step 1

Current index = **0**  
Current number = **3**

Find complement


complement = 6 - 3 = 3


Check HashMap


3 not present


So store the number in the map


HashMap = {3 → 0}


---

### Step 2

Current index = **1**  
Current number = **2**

Find complement


complement = 6 - 2 = 4


Check HashMap


4 not present


Store the number in the map


HashMap = {3 → 0, 2 → 1}


---

### Step 3

Current index = **2**  
Current number = **4**

Find complement


complement = 6 - 4 = 2


Check HashMap


2 is present in the map


We previously stored


{3 → 0, 2 → 1}


So the pair is


nums[1] + nums[2]
2 + 4 = 6


Return indices


[1,2]


---

# Visual Table Dry Run

| Step | Current Number | Complement | HashMap Before | Action |
|-----|---------------|-----------|---------------|-------|
|1|3|3|{}|Store 3|
|2|2|4|{3=0}|Store 2|
|3|4|2|{3=0,2=1}|Found solution|

---

# Time Complexity


O(n)


We traverse the array only once.

HashMap lookup takes **O(1)** time.

---

# Space Complexity


O(n)


The HashMap may store up to **n elements**.