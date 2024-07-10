import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

// This class conects to the API

public class askCurrency {
    public Currency lookForCurrency (String currencyCode){
        URI link = URI.create("https://v6.exchangerate-api.com/v6/611031d4d643f202e8776603/latest/"+currencyCode);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (Exception e) {
            throw new RuntimeException("We could not find that currency");
        }
    }


}
