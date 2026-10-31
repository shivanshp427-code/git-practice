package Pattern_Printing_4;
import java.util.Scanner;
public class Q_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }

    }
}
