package homeworktocheck.hw011pro.task003;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void parseGson(String input) {

        Gson gson = new Gson();

        try {
            JsonElement element = gson.fromJson(input, JsonElement.class);
            String gsonString = gson.toJson(element);
            Files.write(Paths.get("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\main\\java\\homeworktocheck\\hw011pro\\task003\\result.json"), gsonString.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}