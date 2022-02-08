import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Body body;
    Tyres tyres;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Petrol");
        body = new Body("White");
        tyres = new Tyres(12);
        petrolCar = new PetrolCar(9000, body, tyres, engine);
    }

    @Test
    public void hasBodyColour(){
        assertEquals("White", petrolCar.getBody().getColour());
    }

    @Test
    public void hasTyreSize(){
        assertEquals(12, petrolCar.getTyres().getSize());
    }

    @Test
    public void hasFuelType(){
        assertEquals("Petrol", petrolCar.getEngine().getFuelType());
    }

    @Test
    public void hasCarPrice(){
        assertEquals(9000, petrolCar.getPrice());
    }
}
