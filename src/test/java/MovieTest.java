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

    @Test
    public void testGetFrequentRenterPointsForNewReleaseAndBeyondThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.NEW_RELEASE);
        int result = movie.getFrequentRenterPoints(5);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testGetFrequentRenterPointsForNewReleaseAndWithinThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.NEW_RELEASE);
        int result = movie.getFrequentRenterPoints(1);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testGetFrequentRenterPointsForChildrenAndBeyondThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.CHILDREN);
        int result = movie.getFrequentRenterPoints(3);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testGetFrequentRenterPointsForChildrenAndWithinThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.CHILDREN);
        int result = movie.getFrequentRenterPoints(1);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testGetFrequentRenterPointsForRegularAndBeyondThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.REGULAR);
        int result = movie.getFrequentRenterPoints(4);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testGetFrequentRenterPointsForRegularAndWithinThreshold(){
        Movie movie = new Movie("Spider-Man", MovieType.REGULAR);
        int result = movie.getFrequentRenterPoints(1);
        Assert.assertEquals(result, 1);
    }
}
