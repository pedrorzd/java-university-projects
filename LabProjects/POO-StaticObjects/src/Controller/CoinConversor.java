package Controller;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinConversor {
    public static void getCoinValues() throws IOException, InterruptedException {
        // Cotação do Bitcoin em BRL
        String urlBTC = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=brl";

        // Cotação do Dólar (USD -> BRL) com ExchangeRate.host
        String urlUSD = "https://api.coingecko.com/api/v3/simple/price?ids=usd&vs_currencies=brl";

        HttpClient client = HttpClient.newHttpClient();

        // Requisição Bitcoin
        HttpRequest requestBTC = HttpRequest.newBuilder()
                .uri(URI.create(urlBTC))
                .build();

        HttpResponse<String> responseBTC = client.send(requestBTC, HttpResponse.BodyHandlers.ofString());

        // Requisição Dólar
        HttpRequest requestUSD = HttpRequest.newBuilder()
                .uri(URI.create(urlUSD))
                .build();

        HttpResponse<String> responseUSD = client.send(requestUSD, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        // Exibir resultados
        System.out.println("Cotação do Bitcoin (BTC) em BRL:");
        double btcValue = gson.fromJson(responseBTC.body(), double.class);
        System.out.println(btcValue);

        System.out.println("\nCotação do Dólar (USD) em BRL:");
        double usdValue = gson.fromJson(responseUSD.body(), double.class);
        System.out.println(usdValue);
    }
}
