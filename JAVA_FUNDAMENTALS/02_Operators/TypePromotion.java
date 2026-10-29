// Type Promotion and Casting in Arithmetic Expressions
public class TypePromotion {
    public static void main(String[] args) {
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;

        // In mixed expressions, whole expression is promoted to largest type (double)
        // Explicit casting to int:
        int ans = (int) (a + b + c + d);
        System.out.println("Result after explicit casting to int: " + ans);
    }
}
