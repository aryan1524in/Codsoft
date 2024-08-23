import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class CurrencyConverter {
    public static double getRate(String base, String target){
        String key = "13b03d23b9fe739cf544e677";
        String urlstr = "https://api.exchangerate-api.com/v4/latest/" + baseCurrency;

        URL url = new URL(urlstr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if(responseCode != 200){
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        }
        Scannner sc = new Scanner(url.openStrem());
        StringBuilder content = new StringBuilder();

        while (sc.hasNext()) {
            content.append(sc.nextLine());

        }
        sc.close();

        JsonObject jsonobject = new JsonObject(content.toString());
        double exchangerate = jsonobject.getJSONObject("rates").getDouble(targetCurrency);

        return exchangerate;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

     try{
        System.out.print("Enter the base currency : ");
        String baseCurrency = sc.next().toUpperCase();

        // to be continued..

    }
    }
}
