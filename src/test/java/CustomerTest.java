import PeopleAndSales.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() {
        customer = new Customer (700.00);
    }

    @Test
    public void hasMoney() {
        assertEquals(700.00, customer.getMoney(),0.01);
    }
}

