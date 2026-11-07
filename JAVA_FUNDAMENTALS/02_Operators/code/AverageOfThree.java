// Average of Three Numbers
import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double n = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double m = sc.nextDouble();
        System.out.print("Enter 3rd number: ");
        double o = sc.nextDouble();

        double avg = (n + m + o) / 3.0;
        System.out.println("Average: " + avg);
        sc.close();
    }
}
