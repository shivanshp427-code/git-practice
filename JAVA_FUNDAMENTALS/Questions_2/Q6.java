// DIGITAL FREQUENCY COUNTER.
package SISCELLANEOUS;
import java.util.Scanner;
public class Q6 {
    public static int countDigitFrequency(int number, int targetDigits) {
        int n = number;
        int counter = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            if (lastDigit == targetDigits) {
                counter++;
            }

            }
        return counter;

        }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        System.out.print("target number : ");
        int target = sc.nextInt();

        int result = countDigitFrequency(num, target);
        System.out.println("total targeted number is = "+result);



        }

    }
