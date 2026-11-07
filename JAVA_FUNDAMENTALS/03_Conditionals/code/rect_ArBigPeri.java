package if_else_2;
import java.util.Scanner;
public class rect_ArBigPeri {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length :");
        int l= sc.nextInt();
        System.out.print("enter breadth :");
        int b = sc.nextInt();

        int perimeter = 2*(l + b);
        System.out.print("Perimeter is :");
        System.out.println(perimeter);

        int area = (l * b);
        System.out.print("Area is :");
        System.out.println(area);

        if(area > perimeter){
            System.out.println("Area is bigger than perimeter");
        }

        else{
            System.out.println("Perimeter is bigger than area");
        }
    }
}
