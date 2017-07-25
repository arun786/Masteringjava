package koushik;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Adwiti on 7/24/2017.
 */
public class PredicateFunction {

    public static void main(String[] args) {

        List<Artist> artists = Arrays.asList(new Artist("Arun", "singh", 1), new Artist("Sachin", "tendulkar", 5), new Artist("Rahul", "Dravid", 10));
        System.out.println(artists);

        /*use of Predicative to filter based on rating*/
        printBasedOnFilter(artists, p -> p.getRating() > 1);

    }

    public static void printBasedOnFilter(List<Artist> artists, Predicate<Artist> predicate) {
        for (Artist artist : artists) {
            if (predicate.test(artist)) {
                System.out.println(artist);
            }
        }
    }

}


class Artist {
    private String fname;
    private String lname;
    private Integer rating;

    public Artist(String fname, String lname, Integer rating) {
        this.fname = fname;
        this.lname = lname;
        this.rating = rating;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Artist{");
        sb.append("fname='").append(fname).append('\'');
        sb.append(", lname='").append(lname).append('\'');
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
}