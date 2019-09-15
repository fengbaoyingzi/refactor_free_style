public class NewReleasePrice implements Price {
    private static double MULTIPLE = 3.0;

    public double getCharge(int daysRented) {
        return daysRented * MULTIPLE;
    }
}
