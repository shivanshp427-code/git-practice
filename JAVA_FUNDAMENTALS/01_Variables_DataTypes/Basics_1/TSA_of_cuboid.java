package Basics_1;

public class TSA_of_cuboid {
        public static void main(String[] args) {
            double l = 2.5;
            double b = 3.6;
            double h = 4.8;

            double tsa = 2 * (l * b + b * h + h * l);

            System.out.println(tsa);
        }
    }