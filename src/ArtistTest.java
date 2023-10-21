import java.util.ArrayList;

public class ArtistTest {
    public static void main(String[] args) {
        ArtistTest artistTest = new ArtistTest();
        artistTest.testAddValidArtist();
        artistTest.testAddInvalidArtist();
        artistTest.testUpdateValidArtist();
        artistTest.testUpdateInvalidArtist();
        artistTest.testValidOccupationConstraint();
        artistTest.testInvalidOccupationConstraint();
    }

    public void testAddValidArtist() {
        ArrayList<String> occupations = new ArrayList<>();
        occupations.add("Singer");
        ArrayList<String> genres = new ArrayList<>();
        genres.add("Pop");
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2000, Best Artist");

        Artist artist = new Artist("123ABC!", "John Doe", "123 Main St", "01-01-2000", "A talented artist with a bio.", occupations, genres, awards);

        boolean result = artist.addArtist();

        System.out.println("Test Add Valid Artist: " + result);
    }

    public void testAddInvalidArtist() {
        ArrayList<String> occupations = new ArrayList<>();
        ArrayList<String> genres = new ArrayList<>();
        genres.add("Pop");
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2000, Best Artist");

        Artist artist = new Artist("123ABC!", "John Doe", "Invalid|Address", "01-01-2000", "Short bio.", occupations, genres, awards);

        boolean result = artist.addArtist();

        System.out.println("Test Add Invalid Artist: " + result);
    }

    public void testUpdateValidArtist() {
        ArrayList<String> occupations = new ArrayList<>();
        occupations.add("Singer");
        ArrayList<String> genres = new ArrayList<>();
        genres.add("Pop");
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2000, Best Artist");

        Artist artist = new Artist("123ABC!", "John Doe", "123 Main St", "01-01-2000", "A talented artist with a bio.", occupations, genres, awards);

        boolean result = artist.updateArtist();

        System.out.println("Test Update Valid Artist: " + result);
    }

    public void testUpdateInvalidArtist() {
        ArrayList<String> occupations = new ArrayList<>();
        ArrayList<String> genres = new ArrayList<>();
        genres.add("Pop");
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2000, Best Artist");

        Artist artist = new Artist("123ABC!", "John Doe", "Invalid|Address", "01-01-2000", "Short bio.", occupations, genres, awards);

        boolean result = artist.updateArtist();

        System.out.println("Test Update Invalid Artist: " + result);
    }

    public void testValidOccupationConstraint() {
        ArrayList<String> occupations = new ArrayList<>();
        occupations.add("Painter");
        Artist artist = new Artist("123ABC!", "John Doe", "123 Main St", "01-01-1999", "A talented artist with a bio.", occupations, new ArrayList<>(), new ArrayList<>());

        boolean isValid = artist.artistValidator();

        System.out.println("Test Valid Occupation Constraint: " + isValid);
    }

    public void testInvalidOccupationConstraint() {
        ArrayList<String> occupations = new ArrayList<>();
        occupations.add("Painter");
        Artist artist = new Artist("123ABC!", "John Doe", "123 Main St", "01-01-1998", "A talented artist with a bio.", occupations, new ArrayList<>(), new ArrayList<>());

        boolean isValid = artist.artistValidator();

        System.out.println("Test Invalid Occupation Constraint: " + isValid);
    }
}
