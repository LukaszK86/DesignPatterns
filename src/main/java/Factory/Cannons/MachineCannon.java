package Factory.Cannons;

public class MachineCannon extends Cannon {

    public MachineCannon(int armor, int fireRate, float price, int fireRange ) {
        super(armor, fireRate, price);
        this.fireRange = fireRange;
    }

    public String display() {
        return "Price: " + getPrice() + "\nArmor: " + getArmor() + "\nFireRate: " + getFireRate() + "\nFireRange: " + getFirRange();
    }
}
