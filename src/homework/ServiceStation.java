package homework;

import java.util.Collection;

public class ServiceStation {
    public void check(Collection<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> {
            if (vehicle != null) {
                vehicle.serviceVehicle();
                System.out.println();
            }
        });
    }

    public void check(Vehicle vehicle) {
        vehicle.serviceVehicle();
        System.out.println();
    }
}
