
import Singleton.Singleton;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void SingletonTest(){

        Singleton firstName = Singleton.getInstance();
        Singleton secondName = Singleton.getInstance();

        firstName.name = "Kamil";
        secondName.name="Kasia";

       Assert.assertFalse(firstName.name=="Kamil","FirstName");
       Assert.assertTrue(firstName.name=="Kasia","FirstName");


    }
}
