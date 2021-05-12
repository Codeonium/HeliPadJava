import PeopleAndSales.Customer;
import PeopleAndSales.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealer;

    @Before
    public void setUp() {
        dealer = new Dealership (70000.00);
    }

    @Test
    public void hasMoney() {
        assertEquals(70000.00, dealer.getTill(),0.01);
    }
}
