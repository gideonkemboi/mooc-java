
public class CD implements Packable {

    public String artist;
    public String name;
    public int publicationYear;
    public double weight;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publicationYear + ")";
    }
}
