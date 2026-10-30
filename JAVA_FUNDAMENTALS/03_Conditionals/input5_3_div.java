package if_else_2;
import java.util.Scanner;
public class input5_3_div {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int a = sc.nextInt();
        if(a%5 == 0 && a%3 == 0)
            System.out.println("KING");

        else if(a%3 == 0)
            System.out.println("BILLIONAIRE");

        else if(a%5 == 0)
            System.out.println("MILLIONAIRE");

        else
            System.out.println("CONQUEROR");

    }
}
