package ua.com.juja.lab02;

/*
По мотивам популярного анекдота про программистов:
Жена послала мужа-программиста в магазин и сказала: "Купи батон, если яйца есть - купи десяток".
Муж вернулся с 10 батонами.

Функция printPurchases принимает 2 логических параметра на вход: первый - hasEggs, второй - hasBread.
Задание - на основе этих параметров вернуть строку со списком продуктов, которые купил программист.
Например, если hasEggs == true && hasBread == true -> "Eggs,Bread"
Hint:
Чтобы склеить 2 строки следует пользоваться оператором +, Например String purchases = "Bread," + "Eggs";
Для того, чтобы метод вернул значение - используйте ключевое слово return . Например, return "eggs";
(true, true) -> {"eggs,bread", "bread,eggs"} регистр не имеет значения
(false, true) -> {"bread"}
(true, false) -> {"eggs"}
(false, false) -> {""}
 */

public class EggsBread {

    public static String printPurchases(boolean hasEggs, boolean hasBread) {
        if ((hasEggs) && (hasBread)) {
            return "eggs,bread";
        }
        else if (!hasEggs && hasBread) {
            return "bread";
        }
        else if (hasEggs && (!hasBread)) {
            return "eggs";

        }else {
            return "";
        }
    }
}
