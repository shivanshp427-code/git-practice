package TOPIC_4;
import java.util.Scanner;
public class HW_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YEAR : ");
        int n = sc.nextInt();

        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }


    }
}
