import org.testng.Assert;
import org.testng.annotations.Test;

public class RentalTest {

    @Test
    public void testGetChargeForRegularAndWithinThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", 0), 1);
        double result = rental.getCharge();
        Assert.assertEquals(result, 2.0);
    }

    @Test
    public void testGetChargeForRegularAndBeyondThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", 0), 6);
        double result = rental.getCharge();
        Assert.assertEquals(result, 8.0);
    }

    @Test
    public void testGetChargeForNewRelease(){
        Rental rental = new Rental(new Movie("Spider-Man", 1), 4);
        double result = rental.getCharge();
        Assert.assertEquals(result, 12.0);
    }


    @Test
    public void testGetChargeForChildrenAndWithinThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", 2), 2);
        double result = rental.getCharge();
        Assert.assertEquals(result, 1.5);
    }

    @Test
    public void testGetChargeForChildrenAndBeyondThreshold(){
        Rental rental = new Rental(new Movie("Spider-Man", 2), 6);
        double result = rental.getCharge();
        Assert.assertEquals(result, 6.0);
    }
}
