public class ChildrenPrice implements Price{
    private static double INIT_CHARGE = 1.5;
    private static int DAYS_RENTED_THRESHOLD = 3;
    private static double MULTIPLE = 1.5;

    public double getCharge(int daysRented) {
        double result = INIT_CHARGE;
        if (daysRented > DAYS_RENTED_THRESHOLD)
            result += (daysRented - DAYS_RENTED_THRESHOLD) * MULTIPLE;
        return result;
    }
}
