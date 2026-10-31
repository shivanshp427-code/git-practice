# Chapter 05: Pattern Printing

Practicing nested loops to understand row-column matrix representations, managing spaces, and visual coordinate logic.

## What I Learned & Practiced
1. **Basic Patterns:** Started with simple star triangles, inverted pyramids, and character patterns to build intuition for outer loops (rows) and inner loops (columns).
2. **Space Management:** Learned how to print leading spaces before stars/numbers (like Inverted & Rotated Half Pyramid). The inner loop has to be split into two: one for printing spaces and one for stars.
3. **Number Grids:**
   - Floyd’s Triangle: keeping a running count variable that increments across every row.
   - 0-1 Triangle: realizing that printing `1` or `0` depends on whether `(row + col)` is even or odd.
4. **Advanced & Symmetrical Patterns:**
   - Hollow Rectangle: checking boundary conditions `(i == 1 || i == rows || j == 1 || j == cols)`.
   - Solid & Hollow Rhombus: combining row spaces with stars.
   - Butterfly & Diamond Patterns: dividing the problem into upper half and lower half (mirror logic) and calculating changing spaces between stars.

## Personal Notes & Mistakes
- Pattern printing is 90% dry run on paper and 10% coding. If row-to-star mapping formula isn't clear on notebook, code always gives extra spaces or extra lines.
- Off-by-one errors in loop conditions (`<` vs `<=`) frequently messed up the rightmost column.
- Symmetrical patterns (like Diamond and Butterfly) became much easier once I started breaking them into two separate halves instead of doing it in one single loop.
