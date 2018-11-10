package ua.com.juja.lab03;

/*
Реализовать функцию, которая по порядковому номеру вернет текстовый вариант месяца на английском языке
getMonthOfYear(1) = "january"
getMonthOfYear(2) = "february"
....
getMonthOfYear(12) = "december"

Если на вход подается число вне диапазона 1-12 - вернуть пустую строку.
Для того, чтобы метод вернул значение, воспользуйтесь ключевым словом return . Например, return "september";
 */

public class DayMonth {

    // start from 1
    public static String getMonthOfYear(int number) {
        if (number == 1) {
            return "january";
        }
        else if (number == 2) {
            return "february";
        }
        else if (number == 3) {
            return "march";
        }
        else if (number == 4) {
            return "april";
        }
        else if (number == 5) {
            return "may";
        }
        else if (number == 6) {
            return "june";
        }
        else if (number == 7) {
            return "july";
        }
        else if (number == 8) {
            return "august";
        }
        else if (number == 9) {
            return "september";
        }
        else if (number == 10) {
            return "october";
        }
        else if (number == 11) {
            return "november";
        }
        else if (number == 12) {
            return "december";
        }
        else {
            return "";
        }
    }
}
