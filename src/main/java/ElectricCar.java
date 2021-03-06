public class ElectricCar extends Car{

    private Battery battery;
    private Motor motor;

    public ElectricCar(int price, Body body, Tyres tyres, Battery battery, Motor motor) {
        super(price, body, tyres);
        this.battery = battery;
        this.motor = motor;
    }

    public Battery getBattery() {
        return battery;
    }

    public Motor getMotor() {
        return motor;
    }
}
