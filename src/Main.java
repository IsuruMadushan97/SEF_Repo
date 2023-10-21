import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Artist artist = new Artist(
                "668MMMRR%%",
                "John Doe",
                "Melbourne|Victoria|Australia",
                "05-11-1980",
                "A talented artist tes this functions if this workd shei i iwe ididid ii",
                new ArrayList<>(List.of("Sculptor")),
                new ArrayList<>(List.of("Abstract", "Realism")),
                new ArrayList<>(List.of("2023, Best Song Written For Visual Media"))
        );

        // User Sample 2
        /* Artist artist1 = new Artist(
                "123ABC!",
                "Alice Smith",
                "123 Elm St",
                "01-01-1995",
                "A versatile artist with a passion for painting.",
                new ArrayList<>(List.of("Painter", "Sculptor")),
                new ArrayList<>(List.of("Abstract", "Realism")),
                new ArrayList<>(List.of("2019, Best Painter"))
        );*/

        // User Sample 3
        /* Artist artist2 = new Artist(
                "456DEF@",
                "Bob Johnson",
                "456 Oak St",
                "31-02-2000", // Invalid birthdate
                "An artist with a passion for sculpture.",
                new ArrayList<>(List.of("Sculptor")),
                new ArrayList<>(List.of("Surrealism")),
                new ArrayList<>(List.of("2021, Sculptor of the Year"))
        );*/

        // User Sample 4
        /*Artist artist3 = new Artist(
                "789GHI#",
                "Catherine Davis",
                "789 Pine St",
                "15-07-1992",
                "A talented artist specializing in abstract art.",
                new ArrayList<>(List.of("Painter")),
                new ArrayList<>(List.of("Abstract")),
                new ArrayList<>(List.of("2018, Best Abstract Artist"))
        );*/

        // User Sample 4
        /*
        Artist artist4 = new Artist(
                "ABC456%",
                "David Wilson",
                "101 Maple St",
                "02-05-1988",
                "A short bio.", // Invalid bio length
                new ArrayList<>(List.of("Painter")),
                new ArrayList<>(List.of("Impressionism")),
                new ArrayList<>(List.of("2017, Best Impressionist Painter"))
        );*/

        // User Sample 5
        /*Artist artist5 = new Artist(
                "XYZ123&",
                "Eva Anderson",
                "222 Cedar St",
                "10-12-1990",
                "A talented artist with a bio.",
                new ArrayList<>(List.of("Sculptor")),
                new ArrayList<>(List.of("Surrealism")),
                new ArrayList<>(List.of("Best Sculptor 2023")) // Invalid award format
        );*/

        // User Sample 6
        /*Artist artist6 = new Artist(
                "LMN789$",
                "Frank Johnson",
                "333 Walnut St",
                "20-08-1995",
                "An artist with a bio.",
                new ArrayList<>(List.of("Painter")),
                new ArrayList<>(List.of("Pop", "Rock")), // Invalid genre constraint
                new ArrayList<>(List.of("2020, Best Pop Artist"))
        );*/


        //artist.addArtist();
        artist.updateArtist();
    }
}