package ua.com.juja.lab04;

/*
Реализовать функцию, которая по порядковому номеру дня в неделе возвращает его название на английском языке
getDayOfTheWeek(1) = "Monday"
getDayOfTheWeek(2) = "Tuesday"
....
getMonthOfWeek(7) = "Sunday"
Если приходит значение вне диапазона 1-7, то возвращать пустую строку.
Для того, чтобы метод вернул значение - воспользуйтесь ключевым словом return . Например, return "wednesday";
Регистр не имеет значения
 */

public class DayWeek {

    public static String getDayOfTheWeek(int dayNum){
        if (dayNum == 1) {
            return "monday";
        }
        else if (dayNum == 2) {
            return "tuesday";
        }
        else if (dayNum == 3) {
            return "wednesday";
        }
        else if (dayNum == 4) {
            return "thursday";
        }
        else if (dayNum == 5) {
            return "friday";
        }
        else if (dayNum == 6) {
            return "saturday";
        }
        else if (dayNum == 7) {
            return "sunday";
        }
        else {
            return "";
        }
    }
}
