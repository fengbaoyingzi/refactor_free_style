import java.util.*;
import java.util.stream.Collectors;

public class Customer {
    private String _name;
    private List<Rental> _rentals = new LinkedList<>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        result += _rentals.stream().map(rental ->
                "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n")
                .collect(Collectors.joining());
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        return _rentals.stream().mapToInt(rental -> rental.getFrequentRenterPoints()).sum();
    }

    private double getTotalCharge(){
        return _rentals.stream().mapToDouble(rental -> rental.getCharge()).sum();
    }

}
