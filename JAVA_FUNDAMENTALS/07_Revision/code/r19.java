package REV_JAVA;
import java.util.Scanner;
public class r15 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter number : ");
            int start = sc.nextInt();

            int counts = 0;


            System.out.print(start + " ");


            while (start != 1) {
                if (start % 2 == 0) {
                    start = start / 2;
                } else {
                    start = start * 3 + 1;
                }

                counts++;


                System.out.print(start + " ");
            }


            System.out.println();
            System.out.println("Iterations: " + counts);
        }
    }

