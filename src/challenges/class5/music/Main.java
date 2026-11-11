package challenges.class5.music;

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music();

        music1.title = "Roadhouse Blues";
        music1.artist = "The Doors";
        music1.releaseYear = 1970;
        music1.rate(10);
        music1.rate(5);
        music1.showSpecs();
    }
}
