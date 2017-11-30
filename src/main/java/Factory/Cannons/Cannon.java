package Factory.Cannons;

import Factory.PropertiesCannon;

public abstract class Cannon implements PropertiesCannon {


    protected int fireRate;
    protected int armor;
    protected float price;
    protected int fireRange;

    Cannon(int armor, int fireRate, float price) {
        this.armor = armor;
        this.fireRate = fireRate;
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getFireRate() {
        return fireRate;
    }

    @Override
    public int getFirRange() {
        return fireRange;
    }

    public String display() {
        return "Price: " + getPrice() + "\nArmor: " + getArmor() + "\nFireRate: " + getFireRate();
    }
}
