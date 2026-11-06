 // DIGITAL MULTIPLIER SENTINEL.
package SISCELLANEOUS;

public class Q5 {

        // 1. Standalone Dedicated Function (Sitting outside main)
        public static int getDigitProduct(int n) {
            int prod = 1;

            // Trap Check: If input number is already 0, return 0 immediately
            if (n == 0) return 0;

            while (n > 0) {
                int lastDigit = n % 10; // Extracting the rightmost digit

                // Trap Check: If any isolated digit is 0, the final product becomes 0
                if (lastDigit == 0) {
                    return 0; // Short-circuit stack frame instantly
                }

                prod = prod * lastDigit; // Multiplying the digits
                n = n / 10; // Shrinking the number down
            }
            return prod; // Shipping the payload back to the main thread
        }

        // 2. The Primary Execution Thread
        public static void main (String[] args) {
            int testNumber = 234560; // Dynamic input parameter

            // CALL BY VALUE: Passing a copy of testNumber into the method
            int finalResult = getDigitProduct(testNumber);

            System.out.println("Input: " + testNumber);
            System.out.println("Output Product: " + finalResult);
        }
    }


