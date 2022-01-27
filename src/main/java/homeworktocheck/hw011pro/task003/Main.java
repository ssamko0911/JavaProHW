package homeworktocheck.hw011pro.task003;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        String stringJSON = new JSONObject().put("country", "Украина").put("city", "Киев").put("street", "Крещатик").toString();
        GsonParser.parseGson(stringJSON);
    }
}