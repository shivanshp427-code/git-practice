package Pattern_Printing_4;
import java.util.Scanner;
public class Q_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row :");
        int row = sc.nextInt();
        System.out.print("enter column :");
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
