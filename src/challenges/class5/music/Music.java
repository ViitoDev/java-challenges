package challenges.class5.music;

public class Music {
    String title;
    String artist;
    int releaseYear;
    double rating;
    int totalRatings;

    void rate(double score){
        rating += score;
        totalRatings += 1;
    }

    double showRatingMedia(){
        return rating / totalRatings;
    }

    void showSpecs(){
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Rating: " + showRatingMedia());
        System.out.println("Total ratings: " + totalRatings);
    }
}
