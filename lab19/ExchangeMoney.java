package ua.com.juja.lab19;

/*
Номинал мелких монет - 1,2,5,10,25,50.
1 копейку можно разменять 1 разным способом - {1}
2 - двумя разными способами {1 + 1; 2}
5 - 4 {1 + 1 + 1 + 1 + 1; 1 + 1 + 1 + 2; 1 + 2 + 2; 5}
........
Сколькими разными способами можно разменятьгривну (100 монет) ?

Реализовать алгоритм подсчета колличества разных разменов для входящего параметра.
 */

public class ExchangeMoney {

    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsBrutForce(5));
        //System.out.println(exchangeAmountOfCoinsBrutForce(10));
        //System.out.println(exchangeAmountOfCoinsBrutForce(100));
    }
    private static int [] coins = new int[]{1, 2, 5, 10, 25, 50};

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        return findCombination(amountForExchange, coins.length - 1);
    }
    private static int findCombination(int amountForExchange, int indexOfCoin) {
        int counter = 0, sum = 0;
        if (amountForExchange < 0 || indexOfCoin < 0) return 0;
        if (amountForExchange == 0 || indexOfCoin == 0) return 1;

        sum = findCombination(amountForExchange, indexOfCoin - 1) + findCombination(amountForExchange - coins[indexOfCoin], indexOfCoin);
        if (sum == amountForExchange) {
            counter++;
        }
        return counter;
    }
}
