public class ServiceStationForCar implements ServiceStation {
    @Override
    public void check(Car car) {
        ServiceStation.super.check(car);
    }


    @Override
    public void updateTyre() {
        ServiceStation.super.updateTyre();
    }

    @Override
    public void checkEngine() {
        ServiceStation.super.checkEngine();
    }

}
