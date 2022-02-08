import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    ElectricCar electricCar;
    Battery battery;
    Body body;
    Tyres tyres;
    Motor motor;
    HybridCar hybridCar;
    Engine engine;

    @Before
    public void before(){
        dealership = new Dealership(50000);
        customer = new Customer(30000);
        battery = new Battery(50);
        motor = new Motor(25);
        body = new Body("Green");
        tyres = new Tyres(15);
        engine = new Engine("Petrol");
        electricCar = new ElectricCar(12000, body, tyres, battery, motor);
        hybridCar = new HybridCar(24000, body, tyres, battery, motor, engine);
    }

    @Test
    public void hasTill(){
        assertEquals(50000, dealership.getTill());
    }

    @Test
    public void carsStartsEmpty(){
        assertEquals(0, dealership.getCars().size());
    }

    @Test
    public void canBuyCar(){
        dealership.buyCar(electricCar);
        assertEquals(1, dealership.getCars().size());
        assertEquals(38000, dealership.getTill());
    }

    @Test
    public void canSellCarToCustomer(){
        dealership.buyCar(electricCar);
        dealership.sellCar(electricCar, customer);
        assertEquals(0, dealership.getCars().size());
        assertEquals(1, customer.getCars().size());
        assertEquals(50000, dealership.getTill());
        assertEquals(18000, customer.getMoney());
    }

    @Test
    public void canRepairDamage(){
        electricCar.addDamage(20);
        dealership.buyCar(electricCar);
        dealership.repairCar(electricCar);
        assertEquals(38000, dealership.getTill());
        assertEquals(12000, dealership.getCars().get(0).getPrice());
        assertEquals(0, dealership.getCars().get(0).getDamage());
    }
}
