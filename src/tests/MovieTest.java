import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MovieTest {

    private static Movie movie;

    @BeforeAll
    public static void setUp() {
        movie = new Movie("Movie Title", 0);
    }

    @Test
    public void getPriceCode() {
        Assertions.assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        Assertions.assertEquals("Movie Title", movie.getTitle());
    }

}