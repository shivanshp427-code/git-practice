package REV_JAVA;
import java.util.Scanner;
public class r3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no : ");
        int M = sc.nextInt();
        for (int i = 2; i <= M; i++) {
            int sum = 1;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (j != i / j) {
                        sum += i / j;
                    }
                }
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
