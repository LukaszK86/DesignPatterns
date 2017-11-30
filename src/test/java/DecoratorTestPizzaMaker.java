
import Decorator.Mozzarrella;
import Decorator.Pizza;
import Decorator.PlainPizza;
import Decorator.TomatoSauce;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DecoratorTestPizzaMaker {

    @Test
    public void testPizzaMaker() {
        Pizza basicPizza = new TomatoSauce(new Mozzarrella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("The price is: " + basicPizza.getCost());

        Assert.assertTrue(basicPizza.getDescription().contains("mozzarella"),"description");
        Assert.assertTrue(basicPizza.getCost()==4.85,"Price");

    }


}
