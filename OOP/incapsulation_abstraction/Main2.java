package ua.com.juja.a6_oop;

/**
 * Created by indigo on 29.07.2015.
 */
public class Main2 {

    class FIO {
        String firstName;
        String secondName;
    }

    static FIO[] fios = new FIO[10000];

    public static void main(String[] args) {
        int index = 56;

        FIO fio1 = fios[index];
        fio1.firstName = "Stiven";
        fio1.secondName = "Pupkin";

        fios[index + 1].firstName = "Ekaterina";
        fios[index + 1].secondName = "Pupkina";
    }
}
