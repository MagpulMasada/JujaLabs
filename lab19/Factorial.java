package ua.com.juja.lab19;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(number (2));
    }

    public static int number (int n) {
        int counter = 0;
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else return number(n - 2) + number(n - 1);
    }

}
