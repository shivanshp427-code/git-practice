// BINOMIAL COEFFICIENT PRIME INTEGRATOR.
package SISCELLANEOUS;
import java.util.Scanner;
public class Q10 {
     // 1. Standalone Long-Memory Factorial System
        public static long factorial(int n) {
            long f = 1; // Upgraded to long to avoid 13! overflow

            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            return f;
        }

        // 2. The Multi-Call Stack Binary Coefficient Engine
        public static double BinCoff(int n, int r) {
            long fact_n = factorial(n);       // Call 1
            long fact_r = factorial(r);       // Call 2
            long fact_nmr = factorial(n - r); // Call 3

            // Main Mathematical Formula Evaluation
            double finalResult = (double) fact_n / (fact_r * fact_nmr);

            // Problem 5 Rule Verification Layer (Even / Odd Logic Gate)
            if ((int) finalResult % 2 == 0) {
                return finalResult; // Even Case: Direct Payload Shipped
            } else {
                return Math.pow(finalResult, 2); // Odd Case: Power-2 Overridden
            }
        }

        // 3. The Execution Runway
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter n : ");
            int n = sc.nextInt();
            System.out.print("enter r : ");
            int r = sc.nextInt();

            System.out.println("Final Output Payload: " + BinCoff(n, r));
        }
    }

