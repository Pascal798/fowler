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

}