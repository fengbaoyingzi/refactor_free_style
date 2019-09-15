public class NewReleaseAccumulatePoints extends AccumulatePoints {
    private static double DAYS_RENTED_THRESHOLD = 1;

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > DAYS_RENTED_THRESHOLD) ? 2 : 1;
    }
}
