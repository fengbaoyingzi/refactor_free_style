public class Movie {
    private String _title;
    private MovieType _movieType;

    public Movie(String title, MovieType movieType) {
        _title = title;
        _movieType = movieType;
    }

    public MovieType getMovieType() {
        return _movieType;
    }

    public void setMovieType(MovieType _movieType) {
        this._movieType = _movieType;
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int daysRented) {
        double result = 0;
        switch (_movieType) {
            case REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDREN:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

}