package ua.com.juja.lab11;

public class Test {
    public static void main(String[] args) {
        if (MathUtils.lookFor(1) != 0) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
