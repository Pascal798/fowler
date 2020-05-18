import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MovieTest {

    private static Movie movie;

    @BeforeAll
    public static void setUp() {
        movie = new Movie("Iron Man", 0);
    }

    @Test
    public void getPriceCode() {
        Assertions.assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        Assertions.assertEquals("Iron Man", movie.getTitle());
    }

    @Test
    public void getFrequentRenterPoints() {
        Assertions.assertEquals(1, movie.getFrequentRenterPoints(0));
    }

    @Test
    public void getCharge() {
        Assertions.assertEquals(14.0, movie.getCharge(10), 0);
    }

}