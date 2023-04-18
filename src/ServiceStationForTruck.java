public class ServiceStationForTruck implements ServiceStation {
    @Override
    public void check(Truck truck) {
        ServiceStation.super.check(truck);
    }

    @Override
    public void updateTyre() {
        ServiceStation.super.updateTyre();
    }

    @Override
    public void checkEngine() {
        ServiceStation.super.checkEngine();
    }

    @Override
    public void checkTrailer() {
        ServiceStation.super.checkTrailer();
    }
}

