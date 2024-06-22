import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuscadorMoeda {
    private static final String apiToken = "### sua chave da api ###"; //Para conseguir,ler o ReadMe.md

    public static double converterMoeda(String from, String to, double valor) {
        try {
            String url_str = "https://v6.exchangerate-api.com/v6/" + apiToken + "/latest/" + from;
            @SuppressWarnings("deprecation")
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            @SuppressWarnings("deprecation")
            JsonParser jp = new JsonParser();
            @SuppressWarnings("deprecation")
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            double taxaDeCambio = jsonobj.getAsJsonObject("conversion_rates").get(to).getAsDouble();

            return valor * taxaDeCambio;
        } catch (Exception e) {
            System.out.println("Erro ao obter taxa de câmbio: " + e.getMessage());
            return 0;
        }
    }
}
