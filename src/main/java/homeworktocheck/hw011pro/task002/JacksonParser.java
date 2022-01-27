package homeworktocheck.hw011pro.task002;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;

public class JacksonParser {
    public static void parseJSON(String input) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Object object = objectMapper.readValue(input, Object.class);
            objectMapper.writeValue(Paths.get("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\main\\java\\homeworktocheck\\hw011pro\\task002\\result.json").toFile(), object);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}