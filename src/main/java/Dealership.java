import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> cars;
    private int till;

    public Dealership(ArrayList<Car> cars, int till) {
        this.cars = cars;
        this.till = till;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public int getTill() {
        return till;
    }

    public void sellCar(Car car, Customer customer){
        customer.buyCar(car);
        this.till += car.getPrice();
        this.cars.remove(car);
    }
}
