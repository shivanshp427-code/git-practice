// SYMMETRICAL RANGE VALIDATOR(PALINDROME).
package SISCELLANEOUS;
import java.util.Scanner;
public class Q7 {
    public static boolean isSymmetrical(int number) {


        int original = number;
        int rev = 0;
        int last = 0;
        while(number > 0) {
            last = number % 10;
            rev = rev * 10 + last;
            number = number / 10;
            }
        if(rev == original) {
            return true;
        }
            else {
                return false;
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to check : ");
        int inputNum = sc.nextInt();

        boolean status = isSymmetrical(inputNum);

        System.out.print("Is the number symmetrical? " + status);

    }

    }


