import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaTestDriveTest {

	@Test
	public void test() {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza("ham");
		
	}

}
