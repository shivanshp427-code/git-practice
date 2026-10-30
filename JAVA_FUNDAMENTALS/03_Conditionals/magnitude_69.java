package if_else_2;
import java.util.Scanner;
public class magnitude_69 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n < 0) {
            n = -n;
        }
            System.out.println(n);

        if(n<69){
            System.out.println("magnitude is smaller than 69");
        }
        
        else{
            System.out.println("magnitude is not smaller than 69");
        }



    }
}
