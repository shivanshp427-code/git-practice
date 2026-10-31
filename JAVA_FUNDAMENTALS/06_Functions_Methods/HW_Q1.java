package TOPIC_8;
import java.util.Scanner;
public class HW_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. a  : ");
        double x = sc.nextDouble();
        System.out.print("no. b  : ");
        double y = sc.nextDouble();
        System.out.print("no. c  : ");
        double z = sc.nextDouble();
        System.out.println(average(x, y, z));

    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}

