package ua.com.juja.OOP.Equipment;

public abstract class Equipment {
    @Override
    public String toString() {
        return "Equipment" + this.getClass().getSimpleName();
    }
}
