import PeopleAndSales.Customer;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() {
        customer = new Customer (700.00);
    }
}

