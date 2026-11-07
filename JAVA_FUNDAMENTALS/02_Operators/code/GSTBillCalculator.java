// Calculation of GST on Items
import java.util.Scanner;

public class GSTBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Cost of eraser: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Subtotal: " + total);

        float gstRate = 18;
        float finalWithGst = total * (1 + gstRate / 100);
        System.out.println("Final Bill (including 18% GST): " + finalWithGst);
        sc.close();
    }
}
