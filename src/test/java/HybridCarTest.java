import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Battery battery;
    Body body;
    Tyres tyres;
    Motor motor;
    Engine engine;

    @Before
    public void before(){
        battery = new Battery(25);
        motor = new Motor(10);
        engine = new Engine("Diesel");
        body = new Body("Black");
        tyres = new Tyres(18);
        hybridCar = new HybridCar(24000, body, tyres, battery, motor, engine);
    }

    @Test
    public void hasBatteryCapacity(){
        assertEquals(25, hybridCar.getBattery().getCapacity());
    }

    @Test
    public void hasMotorPower(){
        assertEquals(10, hybridCar.getMotor().getPower());
    }

    @Test
    public void hasBodyColour(){
        assertEquals("Black", hybridCar.getBody().getColour());
    }

    @Test
    public void hasTyreSize(){
        assertEquals(18, hybridCar.getTyres().getSize());
    }

    @Test
    public void hasFuelType(){
        assertEquals("Diesel", hybridCar.getEngine().getFuelType());
    }

    @Test
    public void hasCarPrice(){
        assertEquals(24000, hybridCar.getPrice());
    }
}
