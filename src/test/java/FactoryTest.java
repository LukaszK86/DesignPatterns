import Factory.CannonType;
import Factory.CannonsCreator;
import Factory.PropertiesCannon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactoryTest {

    @Test
    public void testFactory() {

        CannonsCreator cannonsCreator = new CannonsCreator();
        PropertiesCannon cannon = cannonsCreator.create(CannonType.LASER);

        Assert.assertEquals(cannon.getPrice(),350.0, "Price");
        Assert.assertTrue(cannon.getFireRate() ==200,"FireRate");

    }
}
