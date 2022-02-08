import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Car> cars;

    public Customer(int money, ArrayList<Car> cars) {
        this.money = money;
        this.cars = cars;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void buyCar(Car car){
        this.cars.add(car);
        this.money -= car.getPrice();
    }
}
