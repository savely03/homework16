package homework;

public abstract class Vehicle {
    private final String modelName; // Название модели
    private final int wheelsCount; // Кол-во колес

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }

    /**
     * Замена покрышки
     */
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    /**
     * Обслуживание транспортного средства
     */
    public void serviceVehicle() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
