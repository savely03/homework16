package homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №16");
        Vehicle car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Vehicle truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Vehicle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(Arrays.asList(car1, car2, truck1, truck2, bicycle1, bicycle2));
//        station.check(car1);
//        station.check(car2);
//        station.check(truck1);
//        station.check(truck2);
//        station.check(bicycle1);
//        station.check(bicycle2);
    }
}