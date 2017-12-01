import Strategy.Context;
import Strategy.Operations.OperationAdd;
import Strategy.Operations.OperationMultiply;
import Strategy.Operations.OperationSubstract;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StrategyPatternTest {

    @Test
    public void testStrategy() {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        Assert.assertEquals(context.executeStrategy(10,5),15);

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        Assert.assertEquals(context.executeStrategy(10,5),5);

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        Assert.assertEquals(context.executeStrategy(10,5),50);

    }
}

