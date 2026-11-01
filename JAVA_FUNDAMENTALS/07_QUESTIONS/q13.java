package CLAUDE_50;
import java.util.Scanner;
public class q13 {
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }

        for(int i = 2; i <= num - 1; i++) {
            if(num % i == 0) {
                return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {

            if (isPrime(i)) {
                if(count > 0)
                    System.out.print(" ");
                System.out.print(i);
                    count++;
                }
            }
            if (count > 0) {
                System.out.println();
            }
            System.out.println("Count = " + count);
        }

    }





