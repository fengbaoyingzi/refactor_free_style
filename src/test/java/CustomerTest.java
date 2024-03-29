import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerTest {

	@Test
	public void testStatement() {
		Customer customer = new Customer("xiaoqiang");
		Movie movie = new Movie("哪吒", MovieType.CHILDREN);
		Rental rental = new Rental(movie, 7);
		Movie movie2 = new Movie("当幸福来敲门", MovieType.NEW_RELEASE);
		Rental rental2 = new Rental(movie2, 4);
		customer.addRental(rental);
		customer.addRental(rental2);
		String result = customer.statement();
		String expection = "Rental Record for xiaoqiang\n";
		expection += "\t哪吒\t7.5\n";
		expection += "\t当幸福来敲门\t12.0\n";
		expection += "Amount owed is 19.5\n";
		expection += "You earned 3 frequent renter points";
		System.out.println(result);
		System.out.println(expection);
		Assert.assertEquals(result, expection);
	}

}
