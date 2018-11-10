package ua.com.juja;

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

    public static void main(String[] args) {
        int dayNum = (int) (Math.random()*12);
        System.out.println(dayNum + getDayOfTheWeek(dayNum));
    }
}
