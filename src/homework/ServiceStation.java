package homework;

public class ServiceStation {
    public void check(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3) {
        if (vehicle1 != null) {
            vehicle1.serviceVehicle();
        }
        if (vehicle2 != null) {
            vehicle2.serviceVehicle();
        }
        if (vehicle3 != null) {
            vehicle3.serviceVehicle();
        }
    }
}
