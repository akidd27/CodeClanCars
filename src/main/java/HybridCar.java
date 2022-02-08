public class HybridCar extends Car{

    private Battery battery;
    private Motor motor;
    private Engine engine;

    public HybridCar(int price, Body body, Tyres tyres, Battery battery, Motor motor, Engine engine) {
        super(price, body, tyres);
        this.battery = battery;
        this.motor = motor;
        this.engine = engine;
    }

    public Battery getBattery() {
        return battery;
    }

    public Motor getMotor() {
        return motor;
    }

    public Engine getEngine() {
        return engine;
    }
}
