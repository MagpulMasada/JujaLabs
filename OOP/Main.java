package ua.com.juja.OOP;

public class Main {
    public static void main(String[] args) {
        House house = new House(16, 4);

        Owner owner1 = new Owner("Steve.Bu");
        Owner owner2 = new Owner("Mia.Bu");
        Owner owner3 = new Owner("Chuck.Min");
        Owner owner4 = new Owner("Horsten.NUB");
        Owner owner5 = new Owner("Kim.Chen");
        Owner owner6 = new Owner("Harald.Bluetooth");
        Owner owner7 = new Owner("Frida.Lung");

        house.settle(owner1);
        house.settle(owner2);
        house.settle(owner3);
        house.settle(owner4);
        house.settle(owner5);
        house.settle(owner6);
        house.settle(owner7);



        System.out.println(house.toString());
    }
}
