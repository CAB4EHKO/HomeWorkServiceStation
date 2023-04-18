public class ServiceStationForBicycle implements ServiceStation {
    @Override
    public void check(Bicycle bicycle) {
        ServiceStation.super.check(bicycle);
    }

    @Override
    public void updateTyre() {
        ServiceStation.super.updateTyre();
    }

}
