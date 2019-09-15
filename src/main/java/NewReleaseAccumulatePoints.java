public class NewReleaseAccumulatePoints extends AccumulatePoints {

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
