package if_else_2;
import java.util.Scanner;
public class money_100_0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();
        int money = (n >= 0) ? 100 : 0;
        System.out.println(money);

    }
}
