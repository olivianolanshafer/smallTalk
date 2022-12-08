import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
  
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class ReadRecipeTest {
    Object obj = new JSONParser().parse(new FileReader("db-recipes.json")); //create file reader
    JSONObject jo = (JSONObject) obj; //instantiate JSON object

    


}
