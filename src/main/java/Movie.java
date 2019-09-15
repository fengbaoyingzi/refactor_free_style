public class Movie {
    private String _title;
    private MovieType _movieType;
    private Price _price;
    private AccumulatePoints _accumulatePoints;

    public Movie(String title, MovieType movieType) {
        _title = title;
        _movieType = movieType;
        setPrice(movieType);
        setAccumulatePoints(movieType);
    }

    public MovieType getMovieType() {
        return _movieType;
    }

    public void setPrice(MovieType movieType) {
        switch (movieType) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDREN:
                _price = new ChildrenPrice();
                break;
        }
    }

    public void setAccumulatePoints(MovieType movieType){
        switch (movieType){
            case NEW_RELEASE:
                _accumulatePoints = new NewReleaseAccumulatePoints();
                break;
            default:
                _accumulatePoints = new AccumulatePoints();
                break;
        }
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return _accumulatePoints.getFrequentRenterPoints(daysRented);
    }

}