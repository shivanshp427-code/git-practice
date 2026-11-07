package if_else_2;
import java.util.Scanner;
public class DivBy_5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int a = sc.nextInt();
        if(a%5 == 0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}
