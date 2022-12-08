import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadRecipe {
   public static void main(String args[]) {
      //Creating a JSONParser object
      JSONParser jsonParser = new JSONParser();
      try {
         //Parsing the contents of the JSON file
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("recipebook.json"));
        String name = (String) jsonObject.get("name");
        System.out.println(name);
        JSONArray ingredients = (JSONArray) jsonObject.get("ingredients");
        Iterator<String> iterator = ingredients.iterator();
        while (iterator.hasNext()) {
            String ingredientName = (String) jsonObject.get("name");
            System.out.println(ingredientName);
            iterator.next();
        }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}