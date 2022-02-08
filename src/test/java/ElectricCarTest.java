import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Battery battery;
    Body body;
    Tyres tyres;
    Motor motor;

    @Before
    public void before(){
        battery = new Battery(50);
        motor = new Motor(25);
        body = new Body("Green");
        tyres = new Tyres(15);
        electricCar = new ElectricCar(12000, body, tyres, battery, motor);
    }

    @Test
    public void hasBatteryCapacity(){
        assertEquals(50, electricCar.getBattery().getCapacity());
    }

    @Test
    public void hasMotorPower(){
        assertEquals(25, electricCar.getMotor().getPower());
    }

    @Test
    public void hasBodyColour(){
        assertEquals("Green", electricCar.getBody().getColour());
    }

    @Test
    public void hasTyreSize(){
        assertEquals(15, electricCar.getTyres().getSize());
    }

    @Test
    public void hasCarPrice(){
        assertEquals(12000, electricCar.getPrice());
    }

    @Test
    public void canDamage(){
        electricCar.addDamage(10);
        assertEquals(11900, electricCar.getPrice());
    }
}
