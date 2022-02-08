import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Battery battery;
    Motor motor;
    Body body;
    Tyres tyres;
    ElectricCar electricCar;

    @Before
    public void before(){
        customer = new Customer(20000);
        battery = new Battery(50);
        motor = new Motor(25);
        body = new Body("Green");
        tyres = new Tyres(15);
        electricCar = new ElectricCar(12000, body, tyres, battery, motor);
    }

    @Test
    public void hasMoney(){
        assertEquals(20000, customer.getMoney());
    }

    @Test
    public void carsStartsEmpty(){
        assertEquals(0, customer.getCars().size());
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(electricCar);
        assertEquals(1, customer.getCars().size());
        assertEquals(8000, customer.getMoney());
    }

}
