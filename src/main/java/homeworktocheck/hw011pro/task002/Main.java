package homeworktocheck.hw011pro.task002;

import org.json.JSONObject;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String stringJSON = new JSONObject().put("country", "Украина").put("city", "Киев").put("street", "Крещатик").toString();
        JacksonParser.parseJSON(stringJSON);
    }
}