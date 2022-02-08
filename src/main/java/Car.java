public abstract class Car {

    private int price;
    private Body body;
    private Tyres tyres;

    public Car(int price, Body body, Tyres tyres) {
        this.price = price;
        this.body = body;
        this.tyres = tyres;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
