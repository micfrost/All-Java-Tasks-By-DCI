package D30_Set.D30_T2_MovieRating_HashSet;

import java.util.Objects;

public class MovieRating {

    String movieTitle;
    double rating;

    public MovieRating(String movieTitle, double rating) {
        this.movieTitle=movieTitle;
        this.rating=rating;
    }

    //    It helps with printing actually values of a custom Object-
    @Override
    public String toString() {
        return "Movie: " + movieTitle + ",\t" +
                " rating=" + rating +
                '.';
    }


    //    It makes sure that hashing works correctly with custom object (using a constructor)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieRating that = (MovieRating) o;
        return Double.compare(rating, that.rating) == 0 && Objects.equals(movieTitle, that.movieTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieTitle, rating);
    }
}


