package if_else_2;
import java.util.Scanner;
public class four_digit_no {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if(999<n && n<10000) {
            System.out.println("4 Digit Number: ");
        }
        else if(n > 10000) {
            System.out.println("Bigger than 4 Digit: ");;
        }

        else {


            System.out.println("Not a 4 Digit Number: ");
        }


    }
}
