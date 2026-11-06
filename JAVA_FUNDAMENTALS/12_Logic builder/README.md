# Chapter 07: Problem Solving & Number Logic Practice

A collection of mixed practice questions focused on math logic, digit extraction, and number theory fundamentals using methods.

## What I Practiced Here
1. **Digit Operations:** Extracting digits using modulo (`% 10`) and division (`/ 10`) to calculate digit sum, count total digits, and reverse integers.
2. **Armstrong Numbers:** Checking if the sum of cubes of each digit equals the original number (handling digit power and saving the original value).
3. **Prime Number Testing:** Testing divisibility of numbers and handling edge cases like 0 and 1.
4. **Factorial & Series:** Generating iterative factorial values and printing the first N terms of the Fibonacci sequence (`0, 1, 1, 2, 3, 5...`).

## Questions Summary
- `q4.java` - Basic even/odd method check
- `q5.java` & `q6.java` - Sum of digits and counting digits in a number
- `q7.java` & `q8.java` - Reversing a number using while loop
- `q9.java` & `q10.java` - Armstrong number validation and digit-count helper
- `q12.java` & `q13.java` - Prime number checking logic
- `q14.java` - Factorial calculation
- `q15.java` - Fibonacci sequence generation

## Notes & Observations
- In Armstrong and reverse number problems, always store the input in an `original` variable first, because the `while (num > 0)` loop reduces `num` to 0.
- For digit count, remember edge case: if input is `0`, the count should be `1` (not `0`).
