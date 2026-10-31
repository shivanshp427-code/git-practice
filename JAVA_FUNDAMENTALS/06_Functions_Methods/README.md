# Chapter 06: Functions & Methods

Practicing modular coding in Java using functions and methods. Learning how to pass arguments, return values, and reuse logic instead of writing the same code again and again.

## What I Learned & Practiced
1. **Basics of Methods:** Syntax of defining methods, return types (`void`, `int`, `boolean`), and understanding Java's pass-by-value mechanism (swapping two numbers inside a method does not change the original variables in `main`).
2. **Reusing Functions:** Calculated Binomial Coefficient `nCr = n! / (r! * (n-r)!)` by calling the `factorial()` method three times instead of writing three separate loops.
3. **Number Conversions:** 
   - Binary to Decimal conversion using base-2 powers.
   - Decimal to Binary conversion using remainder by 2 and place value multiplication.
4. **Prime Number Logic:** Writing helper functions to check if a number is prime, optimizing it up to `Math.sqrt(n)` instead of running loop till `n-1`, and printing all primes in a given range.
5. **Method Overloading:** Writing multiple methods with the same name by changing either the number of parameters or their data types.
6. **Practice Questions:** Checking palindrome numbers and finding the sum of digits using separate reusable methods.

## Personal Notes & Mistakes
- Forgot that Java is strictly pass-by-value during swap practice; had to understand stack frames to see why values didn't change in `main`.
- In binary to decimal conversion, keeping track of power (`Math.pow` or multiplying by 10/2) can get confusing if loop condition is not clean.
- Method overloading only depends on parameters list, changing just the return type gives a compile error.
