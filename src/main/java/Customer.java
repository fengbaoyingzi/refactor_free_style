import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            frequentRenterPoints++;
            if ((rental.getMovie().getMovieType() == MovieType.NEW_RELEASE)
                    && rental.getDaysRented() > 1)
                frequentRenterPoints++;
            result += "\t" + rental.getMovie().getTitle() + "\t"
                    + rental.getCharge() + "\n";
            totalAmount += rental.getCharge();
        }
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
        return result;
    }

}
