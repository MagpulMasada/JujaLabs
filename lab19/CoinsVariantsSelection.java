package ua.com.juja.lab19;

public class CoinsVariantsSelection {
    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsBrutForce(5));
        System.out.println(exchangeAmountOfCoinsBrutForce(10));
        System.out.println(exchangeAmountOfCoinsBrutForce(100));
    }

    private static int [] coins = new int[]{1, 2, 5, 10, 25, 50};

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int counter = 0, stack = 0;
        if (amountForExchange <= 0) return 0;
        for (int i50 = 0; i50 <= amountForExchange / coins[5]; i50++) {
            for (int i25 = 0; i25 <=amountForExchange / coins[4]; i25++) {
                for (int i10 = 0; i10 <=amountForExchange / coins[3]; i10++) {
                    for (int i5 = 0; i5 <=amountForExchange / coins[2]; i5++) {
                        for (int i2 = 0; i2 <=amountForExchange / coins[1]; i2++) {
                            for (int i1 = 0; i1 <=amountForExchange; i1++) {
                                stack = (i50 * coins[5] + i25 * coins[4] + i10 * coins[3] + i5 * coins[2] + i2 * coins[1] + i1);
                                if (stack == amountForExchange) {
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }
}
