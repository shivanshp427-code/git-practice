# Miscellaneous Patterns Practice

Extra practice set on nested loops and coordinate-based pattern problems. Focused on building strong visual dry-run habits on notebook before touching the keyboard.

---

## Questions & Logic Breakdown

- **Q_1: Hollow Rectangle**
  - Boundary check logic: star prints only when `i == 1 || i == n || j == 1 || j == m`, otherwise blank space.
- **Q_2: Inverted Right Half Pyramid**
  - Decreasing stars row by row using `j <= n + 1 - i`.
- **Q_3: Inverted & Rotated Half Pyramid**
  - Managing two inner loops: first for leading spaces (`n - i`), second for stars (`1` to `i`).
- **Q_4: Symmetrical Centered Star Pyramid**
  - Leading spaces incrementing while star counts decrement systematically.
- **Q_5: Floyd's Number Triangle**
  - Continuous running counter incremented on every print across rows.
- **Q_6: Binary (0-1) Triangle**
  - Odd/even parity check on indices: if `(i + j) % 2 == 0` print `1`, else `0`.
- **Q_7: Hollow Star Diamond**
  - Coordinate equation logic: stars at border lines `i + j == n + 1`, `Math.abs(i - j) == n - 1`, and `i + j == 3 * n - 1`.
- **Q_8: Number Spiral / Distance from Edges**
  - Classic matrix problem with size `2*n - 1`. Distance calculated using `min(top, bottom, left, right)` from the borders.
- **Q_9: Hollow Star Bridge**
  - Bridge structure with spaces opening up in the middle while maintaining left and right star borders.
- **Q_10: Alternating Number & Character Rows**
  - Odd rows print numbers `1` to `i`, even rows print characters `(char)('A' + j - 1)`.

---

## Key Takeaways
- For complex shapes (like Hollow Diamond or Concentric Numbers), guessing loop conditions in IDE wastes time. Writing row-column coordinates $(i, j)$ on paper and deriving the linear equation is the only clean way.
- Always check 1-based indexing vs 0-based indexing carefully before running loops to avoid off-by-one errors.
