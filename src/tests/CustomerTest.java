import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CustomerTest {

    private static Customer customer;

    @BeforeAll
    public static void setUp() {
        customer = new Customer("Pascal");
    }

    @Test
    public void getName() {
        Assertions.assertEquals("Pascal", customer.getName());
    }

    @Test
    public void statement() {
        String statement = "Rental Record for Pascal" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

        Assertions.assertEquals(statement, customer.statement());
    }
}