
package if_else_2;
import java.util.Scanner;

public class profit_percent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter cp: ");
        Double cp = sc.nextDouble();
        System.out.print("enter sp: ");
        Double sp = sc.nextDouble();

        if(sp > cp) {
            double profit = sp - cp;
            double profitPercentage = (profit / cp) * 100;

            System.out.println("profit is " + profit);
            System.out.println("profit percentage is " + profitPercentage + "%");
        }
        else if(sp < cp) {
            double loss = cp - sp;
            double lossPercentage = (loss / cp) * 100;

            System.out.println("loss is " + loss);
            System.out.println("loss percentage is " + lossPercentage + "%");
        }
        else {
            System.out.println("no profit no loss 0");
        }
    }
}
