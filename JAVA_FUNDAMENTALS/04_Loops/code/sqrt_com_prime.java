package Loops_3;
import java.util.Scanner;
public class sqrt_com_prime {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int n = sc.nextInt();

            boolean flag = true; // true means prime (Raghav Sir's default assumption)

            // Loop running up to Math.sqrt(n) exactly as shown in the lecture
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // If a factor is found
                    flag = false; // marked as composite
                    break;        // instantly exit the loop
                }
            }

            // Output matrix directly matching his exact print logic
            if (n == 1) {
                System.out.println("Neither Prime nor Composite");
            } else if (flag == false) {
                System.out.println("Composite Number");
            } else {
                System.out.println("Prime Number");
            }

        }
    }


