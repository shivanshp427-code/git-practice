// OPTIMISED(Math.sqrt(n)FUNCTION); TO CHECK PRIME OR NOT.
package TOPIC_8;
import java.util.Scanner;
public class CW_10 {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(156));
    }
}

