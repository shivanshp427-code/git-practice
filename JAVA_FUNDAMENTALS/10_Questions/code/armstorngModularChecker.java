// ARMSTRONG MODULAR CHECKER.
package SISCELLANEOUS;

public class Q9 {
    public static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        int power = countDigits(n);
        int temp = n;
        long sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += (long) Math.pow(digit, power);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));  // 153 is true because 153 == 1cube+5cube+3cube(all power 3).
    }
}


