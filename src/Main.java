import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("SEF App test");

        //Valid artist information
        Artist artist = new Artist(
                "655GHIJK@$",
                "Alicia Davis",
                "Melbourne|Victoria|Australia",
                "05-11-1972",
                "R&B and soul singer known for powerful vocals.",
                new ArrayList<>(List.of("Singer", "Songwriter")),
                new ArrayList<>(List.of("Abstract", "Realism")),
                new ArrayList<>(List.of("2019, Best R&B Album"))
        );

        //Invalid artist ID
         /*Artist artist1 = new Artist(
                "47InvalidID", //Invalid ID
                "Alicia Davis",
                "987 Lamest St",
                "21-10-1997",
                "A versatile artist with a passion for singing.",
                new ArrayList<>(List.of("Singer")),
                new ArrayList<>(List.of("Producer", "DJ")),
                new ArrayList<>(List.of("2018, Best singer"))
        );*/

         //Invalid Genres (Pop and Rock Together)
         /*Artist artist2 = new Artist(
                "877LMNOP!%",
                "Daniel Brown",
                "749 Occenls St",
                "28-02-1980",
                "Singer and songwriter with a passion for music.",
                new ArrayList<>(List.of("Lyrics Artist", "Songwriter")),
                new ArrayList<>(List.of("Pop", "Rock")),// Invalid genre constraint
                new ArrayList<>(List.of("2021, Best Song Written For Visual Media"))
        );*/

        // Invalid Bio (Less than 10 words)
        /*Artist artist3 = new Artist(
                "666UVWXYZ!#",
                "Maria Rodriguez",
                "789 epping St",
                "15-03-1992",
                "A talented artist specializing in abstract art.",
                new ArrayList<>(List.of("Singer")),
                new ArrayList<>(List.of("Jazz")),
                new ArrayList<>(List.of("2021, singer of the Year"))
        );*/

        // Invalid bio length
        /*Artist artist4 = new Artist(
                "877LMNOP!%",
                "David Wilson",
                "838 kingsburry St",
                "12-11-1992",
                "A short bio.", // Invalid bio length
                new ArrayList<>(List.of("Painter")),
                new ArrayList<>(List.of("Impressionism")),
                new ArrayList<>(List.of("2017, Best Impressionist Painter"))
        );*/

        // Valid Artist Update with Same Birth Year
        /*Artist artist5 = new Artist(
                "655GHIJK@$",
                "Emily Johnson",
                "386 dear park St",
                "18-10-1993",
                "Singer and songwriter with a passion for music",
                new ArrayList<>(List.of("Singer", "Songwriter")),
                new ArrayList<>(List.of("pop", "classical")),
                new ArrayList<>(List.of("2022, Best Song Written For Visual Media")) // Invalid award format
        );*/

        // Invalid Artist Update (Occupations Changed for Artist Born Before 2000)
        /*Artist artist6 = new Artist(
                "723XYZPP!@",
                "Alicia Davis",
                "681 planty St",
                "12-04-1984",
                "Versatile musician and performer.",
                new ArrayList<>(List.of("Painter")),// Invalid genre constraint
                new ArrayList<>(List.of("Pop", "Rock")),
                new ArrayList<>(List.of("2020, Best Pop Artist"))
        );*/


        artist.addArtist();
        //artist.updateArtist();
    }
}