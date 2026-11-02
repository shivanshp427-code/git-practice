package REV_JAVA;
import java.util.Scanner;
public class r14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int temp1 = n;
        int temp2 = n;
        int sum = 0;
        int count = 0;


        while (temp1 > 0) {
            count++;
            temp1 = temp1 / 10;
        }
        while (temp2 > 0) {
            int digit = temp2 % 10;


            int product = 1;
            for (int i = 1; i <= count; i++) {
                product = product * digit;
            }

            sum += product;

            temp2 = temp2 / 10;



        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is NOT an Armstrong Number");
        }



    }
}
