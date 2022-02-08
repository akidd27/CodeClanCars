import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> cars;
    private int till;

    public Dealership(int till) {
        this.cars = new ArrayList<>();
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

    public void buyCar(Car car){
        this.cars.add(car);
        this.till -= car.getPrice();
    }

    public void repairCar(Car car){
        this.till -= (car.getDamage() * 10);
        car.repairDamage();
    }
}
