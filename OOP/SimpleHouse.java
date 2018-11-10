package ua.com.juja.OOP;

public class SimpleHouse {

    private int floorsCount;
    private int apartmentsOnFloor;

    public SimpleHouse(int floorsCount, int apartmentsOnFloor) {
        this.floorsCount = floorsCount;
        this.apartmentsOnFloor = apartmentsOnFloor;
    }

    @Override
    public String toString() {
        String result = "House:\n";
        for (int x = 0; x < floorsCount; x++) {
            for (int y = 0; y < apartmentsOnFloor; y++) {
                result += "#";
            }
            result += "\n";
        }
        return result;
    }
}
