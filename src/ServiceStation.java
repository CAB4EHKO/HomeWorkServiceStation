public interface ServiceStation {
    default void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    default void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

    default void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            updateTyre();
        }
    }

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    default void checkEngine(){
            System.out.println("Проверяем двигатель");
    }

    default void checkTrailer(){
        System.out.println("Проверяем прицеп");
    };
}
