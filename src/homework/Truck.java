package homework;

public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    /**
     * Проверка прицепа
     */
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    /**
     * Переопределенный метод обслуживания ТС
     */
    @Override
    public void serviceVehicle() {
        super.serviceVehicle();
        checkTrailer();
    }
}
