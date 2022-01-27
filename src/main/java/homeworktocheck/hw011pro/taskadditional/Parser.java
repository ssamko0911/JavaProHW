package homeworktocheck.hw011pro.taskadditional;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Parser {

    public static void parseJSON(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Currency[] currencies = objectMapper.readValue(new URL(url), Currency[].class);
        System.out.println("Вывод 3х валют на выбор с API НБУ: ");
        System.out.println("_".repeat(150));
        for (Currency currency : currencies) {
            if (currency.getCurrencyCode().equals("840")
                    || currency.getCurrencyCode().equals("978")
                    || currency.getCurrencyCode().equals("643")) {
                System.out.println(currency);
            }
        }
        System.out.println("_".repeat(150));
    }
}