package homework;

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
        station.check(car1, null, null);
        System.out.println("-------------------------------------------");
        station.check(car2, null, null);
        System.out.println("-------------------------------------------");
        station.check(null, bicycle1, null);
        System.out.println("-------------------------------------------");
        station.check(null, bicycle2, null);
        System.out.println("-------------------------------------------");
        station.check(null, null, truck1);
        System.out.println("-------------------------------------------");
        station.check(null, null, truck2);
        System.out.println("-------------------------------------------");
        station.check(null, null, null);
    }
}