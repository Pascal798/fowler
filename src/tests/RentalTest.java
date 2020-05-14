import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RentalTest {

    private static Rental rental;
    private static Movie movie;

    @BeforeAll
    public static void setUp() {
        movie = new Movie("Iron Man", 0);
        rental = new Rental(movie, 10);
    }

    @Test
    public void getDaysRented() {
        Assertions.assertEquals(10, rental.getDaysRented());
    }

    @Test
    public void getMovie() {
        Assertions.assertEquals(movie, rental.getMovie());
    }
}