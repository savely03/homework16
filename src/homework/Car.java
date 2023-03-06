package homework;

public class Car extends Vehicle {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    /**
     * Переопределенный метод обслуживания ТС
     */
    @Override
    public void serviceVehicle() {
        super.serviceVehicle();
        checkEngine();
    }

    /**
     * Проверка двигателя
     */
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
