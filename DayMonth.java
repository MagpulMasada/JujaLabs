package ua.com.juja;

public class DayMonth {
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

    public static void main(String[] args) {
        int number = (int) (Math.random()*12);
        System.out.println(number + getMonthOfYear(number));
    }
}
