package if_else_2;
import java.util.Scanner;
public class profit_loss {
   public  static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("enter cp: ");
            Double cp = sc.nextDouble();
            System.out.print("enter sp: ");
            Double sp = sc.nextDouble();

            if(sp > cp) {
                System.out.println("profit is "+(sp-cp));

            }

            else if(sp < cp){
                System.out.println("loss is "+(cp-sp));

            }
            else{

                System.out.println("no profit no loss 0");
            }



    }
}
