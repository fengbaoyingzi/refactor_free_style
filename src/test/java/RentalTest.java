import org.testng.Assert;
import org.testng.annotations.Test;

public class RentalTest {

    @Test
    public void testGetChargeForRegularAndWithinThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.REGULAR), 1);
        double result = rental.getCharge();
        Assert.assertEquals(result, 2.0);
    }

    @Test
    public void testGetChargeForRegularAndBeyondThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.REGULAR), 6);
        double result = rental.getCharge();
        Assert.assertEquals(result, 8.0);
    }

    @Test
    public void testGetChargeForNewRelease(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.NEW_RELEASE), 4);
        double result = rental.getCharge();
        Assert.assertEquals(result, 12.0);
    }


    @Test
    public void testGetChargeForChildrenAndWithinThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.CHILDREN), 2);
        double result = rental.getCharge();
        Assert.assertEquals(result, 1.5);
    }

    @Test
    public void testGetChargeForChildrenAndBeyondThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.CHILDREN), 6);
        double result = rental.getCharge();
        Assert.assertEquals(result, 6.0);
    }

    @Test
    public void testGetFrequentRenterPointsForNewReleaseAndBeyondThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.NEW_RELEASE), 6);
        int result = rental.getFrequentRenterPoints();
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testGetFrequentRenterPointsForNewReleaseAndWithinThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.NEW_RELEASE), 1);
        int result = rental.getFrequentRenterPoints();
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testGetFrequentRenterPointsForChildrenAndBeyondThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.CHILDREN), 6);
        int result = rental.getFrequentRenterPoints();
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testGetFrequentRenterPointsForChildrenAndWithinThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.CHILDREN), 1);
        int result = rental.getFrequentRenterPoints();
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testGetFrequentRenterPointsForRegularAndBeyondThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.REGULAR), 6);
        int result = rental.getFrequentRenterPoints();
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testGetFrequentRenterPointsForRegularAndWithinThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", MovieType.REGULAR), 1);
        int result = rental.getFrequentRenterPoints();
        Assert.assertEquals(result, 1);
    }

}
