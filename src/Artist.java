import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class Artist {
    private String ID;
    private String Name;
    private String Address;
    private String Birthdate;
    private String Bio;
    private ArrayList<String> Occupations;
    private ArrayList<String> Genres;
    private ArrayList<String> Awards;

    public Artist(String id, String name, String address, String birthdate, String bio,
                  ArrayList<String> occupations, ArrayList<String> genres, ArrayList<String> awards) {
        ID = id;
        Name = name;
        Address = address;
        Birthdate = birthdate;
        Bio = bio;
        Occupations = occupations;
        Genres = genres;
        Awards = awards;
    }



    public boolean addArtist() {
        if(this.artistValidator()){
            this.saveToJsonFile("./artist.txt");
            return true;
        } else {
            return false;
        }
    }

    public boolean updateArtist() {
        if(this.artistValidator()){
            this.saveToJsonFile("./artist.txt");
            return true;
        } else {
            return false;
        }
    }

    public void saveToJsonFile(String filePath) {
        JSONObject artistJson = this.toJson();

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(artistJson.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JSONObject toJson() {
        JSONObject artistJson = new JSONObject();
        artistJson.put("ID", this.ID);
        artistJson.put("Name", this.Name);
        artistJson.put("Address", this.Address);
        artistJson.put("Birthdate", this.Birthdate);
        artistJson.put("Bio", this.Bio);

        // Convert ArrayLists to JSON arrays
        JSONArray occupationsJson = new JSONArray(this.Occupations);
        JSONArray genresJson = new JSONArray(this.Genres);
        JSONArray awardsJson = new JSONArray(this.Awards);

        artistJson.put("Occupations", occupationsJson);
        artistJson.put("Genres", genresJson);
        artistJson.put("Awards", awardsJson);

        return artistJson;
    }

    public boolean artistValidator() {
        String idRegex = "^[5-9]{3}[A-Z]{5}[!@#$%^&*()]\\p{Punct}$";
        String birthDayRegex = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$";
        String addressRegex = "^[A-Za-z ]+\\|[A-Za-z ]+\\|[A-Za-z ]+$";

        Pattern idPattern = Pattern.compile(idRegex);
        Pattern birthdayPattern = Pattern.compile(birthDayRegex);
        Pattern addressPattern = Pattern.compile(addressRegex);

        Matcher idMatcher = idPattern.matcher(this.ID);
        Matcher birthdayMatcher = birthdayPattern.matcher(this.Birthdate);
        Matcher addressMatcher = addressPattern.matcher(this.Address);

        boolean is_ID_BD_ADD_Valid = idMatcher.matches() && birthdayMatcher.matches() && addressMatcher.matches();

        System.out.println(idMatcher.matches());

        StringTokenizer tokenizer = new StringTokenizer(this.Bio);
        int wordCount = tokenizer.countTokens();
        boolean is_BIO_Valid = wordCount >= 10 && wordCount <= 30;

        boolean is_Occupation_Valid = this.Occupations.size() >= 1 && this.Occupations.size() <= 5;

        int count = 0;
        for (String award : this.Awards) {
            String[] parts = award.split(",");
            if (parts.length == 2) {
                String year = parts[0].trim();
                String title = parts[1].trim();
                if (year.matches("\\d{4}") && title.split(" ").length >= 4 && title.split(" ").length <= 10) {
                    count++;
                }
            }
        }
        boolean is_Awards_Valid = count >= 0 && count <= 3;

        int genresCount = this.Genres.size();
        boolean hasPop = false;
        boolean hasRock = false;
        for (String genre : this.Genres) {
            String trimmedGenre = genre.trim();
            if (trimmedGenre.equals("pop")) {
                hasPop = true;
            } else if (trimmedGenre.equals("rock")) {
                hasRock = true;
            }
        }
        boolean is_Genres_Valid = genresCount >= 2 && genresCount <= 5 && !(hasPop && hasRock);

        return is_ID_BD_ADD_Valid && is_BIO_Valid && is_Occupation_Valid && is_Awards_Valid && is_Genres_Valid;
    }
}
