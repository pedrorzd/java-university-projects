package Controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinConversor {
    private static double valorBtc;
    private static double valorUsd;

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

        // resultados
        String btc = responseBTC.body();
        String usd = responseUSD.body();

        //editando o json

        String buscaBtc = "\"{'bitcoin':{'brl':";
        String buscaUsd = "\"{'usd':{'brl':";

        int inicioBtc = btc.indexOf(buscaBtc) + buscaBtc.length();
        int fimBtc = btc.indexOf("}}", inicioBtc);
        String valorBtcString = btc.substring(inicioBtc, fimBtc).trim();

        int inicioUsd = usd.indexOf(buscaUsd) + buscaUsd.length();
        int fimUsd = usd.indexOf("}}", inicioUsd);
        String valorUsdString = usd.substring(inicioUsd, fimUsd).trim();

        valorBtc = Double.parseDouble(valorBtcString);
        valorUsd = Double.parseDouble(valorUsdString);
    }

    public static double getValorBtc() {
        return valorBtc;
    }

    public static double getValorUsd() {
        return valorUsd;
    }

    public static double getValorConvertido(double valorParaConverter, double moedaDesejada) {
        double valorConvertido = valorParaConverter * moedaDesejada;
        return valorConvertido;
    }
}
