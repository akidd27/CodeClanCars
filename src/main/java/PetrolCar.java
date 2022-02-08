public class PetrolCar extends Car{

    private Engine engine;

    public PetrolCar(int price, Body body, Tyres tyres, Engine engine) {
        super(price, body, tyres);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
