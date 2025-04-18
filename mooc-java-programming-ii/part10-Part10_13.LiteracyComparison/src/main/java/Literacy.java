
public class Literacy {

    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacyPercentage;

    public Literacy(String theme, String ageGroup, String gender, String country, int year, double literacyPercentage) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender.split(" ")[1];
        this.country = country;
        this.year = year;
        this.literacyPercentage = literacyPercentage;
    }

    public double getLiteracyPercentage() {
        return literacyPercentage;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyPercentage;
    }
}
