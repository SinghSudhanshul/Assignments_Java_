# Assignment Overview — Multi-Level Java Practice System

## What This Assignment Is About (In Simple Words)

This assignment is not just about solving programs.
It is about learning how to organize solutions like a real software developer instead of writing everything inside `main()`.

You are given a set of problems divided into Levels.
Each level contains logical or mathematical programs such as:

* Checking divisibility
* Comparing numbers
* Finding largest or smallest values
* Working with natural numbers
* Performing formula-based calculations

These are simple problems, but the goal is to implement them using good programming structure.

---

## The Real Learning Objective

Instead of writing one long program, we:

* Write each question as a separate function (method)
* Keep logic reusable and clean
* Call those methods from a controller (main/orchestrator)
* Use inheritance to organize Levels
* Compare:

  * A normal approach
  * An optimized approach (best time and space complexity)

This teaches how real applications are designed.

---

## How the Program Is Structured

We design the system like this:

Base Class → Contains shared behavior (input, formatting, etc.)

Level Class → Contains solutions for that level

Two Versions Per Level:

1. Standard Method (usual way students solve)
2. Optimized Method (best mathematical or logical approach)

Main Orchestrator → Runs everything in order like a test paper

This is called modular programming.

---

## Why Two Files Per Level?

For every level we create:

Level1_Standard.java — Uses normal logic (loops, step-by-step checks)
Level1_Optimized.java — Uses formulas or smarter logic
Level2_Standard.java — Same problems solved normally
Level2_Optimized.java — Same problems solved efficiently

This shows the difference between:

“Program that works”
and
“Program that works efficiently”

---

## Example of the Difference

Problem: Sum of First n Natural Numbers

Standard Method (Slower)

Add numbers one by one:

sum = 0
for i from 1 to n:
  sum = sum + i

Time Complexity: O(n)
We must loop n times.

---

Optimized Method (Best Approach)

Use the mathematical formula:

sum = n × (n + 1) / 2

Time Complexity: O(1)
No loop. Instant calculation.

---

## What Do Time and Space Complexity Mean?

Time Complexity — How long a program takes to run
Space Complexity — How much memory it uses

We aim for:

* Less looping
* Fewer temporary variables
* Direct formulas when possible

---

## Why This Matters (In Real Life)

This assignment builds the mindset needed for:

* Writing scalable software
* Performing well in coding interviews
* Understanding algorithm efficiency
* Moving from student coding to developer thinking

---

## Role of the Orchestrator Class

The Orchestrator acts like an examiner.

It calls:

Run Level 1
Run Level 2
Run Level 3

Inside each level, it runs all questions in a structured order.

This separates:

* Execution control
* Business logic

Which is exactly how real systems work.

---

## Summary

This assignment teaches:

* Functions and modular design
* Code reuse
* Inheritance for structure
* Comparing naive vs optimized solutions
* Thinking mathematically before coding
* Writing clean, maintainable programs

---

