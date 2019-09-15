import org.testng.Assert;
import org.testng.annotations.Test;

public class MovieTest {
    @Test
    public void testGetChargeForRegularAndWithinThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.REGULAR);
        double result = movie.getCharge(1);
        Assert.assertEquals(result, 2.0);
    }


    @Test
    public void testGetChargeForRegularAndBeyondThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.REGULAR);
        double result = movie.getCharge(9);
        Assert.assertEquals(result, 12.5);
    }

    @Test
    public void testGetChargeForNewRelease(){
        Movie movie = new Movie("Spider-Man", MovieType.NEW_RELEASE);
        double result = movie.getCharge(7);
        Assert.assertEquals(result, 21.0);
    }


    @Test
    public void testGetChargeForChildrenAndWithinThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.CHILDREN);
        double result = movie.getCharge(1);
        Assert.assertEquals(result, 1.5);
    }

    @Test
    public void testGetChargeForChildrenAndBeyondThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.CHILDREN);
        double result = movie.getCharge(5);
        Assert.assertEquals(result, 4.5);
    }
}
