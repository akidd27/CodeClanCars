public abstract class Car {

    private int price;
    private Body body;
    private Tyres tyres;
    private int damage;

    public Car(int price, Body body, Tyres tyres) {
        this.price = price;
        this.body = body;
        this.tyres = tyres;
        this.damage = 0;
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

    public void addDamage(int damage){
        this.damage += damage;
        this.price -= (damage * 10);
    }

    public int getDamage() {
        return damage;
    }

    public void repairDamage(){
        this.price += (this.getDamage() * 10);
        this.damage = 0;
    }
}
