# Miscellaneous Matrix & Math Practice

Practice set completed right before transitioning into core Data Structures & Algorithms (Arrays). Focused on advanced 2D coordinate tracing, diagonal condition checks, and digit manipulation logic.

---

## Problems & Logic Summary

- **Q1: Imperial X Cross Shield**
  - Combining box boundary checks `(i == 1 || i == n || j == 1 || j == n)` with principal and secondary diagonals `(i == j || i + j == n + 1)`.
- **Q2: Inner Diamond Matrix**
  - Split into upper and lower symmetric halves. Managing inner spaces to carve out a diamond hollow inside a square boundary.
- **Q3: Digital Sand-Glass Matrix**
  - Hourglass matrix logic: tapering downwards using decreasing width and increasing leading spaces, then expanding back symmetrically in the second half.
- **Q4: Spiral Border Tracer Matrix**
  - Outer border tracing along with checking the exact center-pivot coordinate `(i == n/2 + 1 && j == n/2 + 1)`.
- **Q5: Digital Multiplier Sentinel**
  - Standalone utility function to compute the product of digits of an integer. Includes edge-case sentinel handling when input `n == 0`.

---

## Takeaways Before Starting Arrays
- Transitioning from visual 2D matrix patterns into memory-contiguous 1D/2D arrays.
- Clean separation of helper logic into dedicated static methods outside `main`.
