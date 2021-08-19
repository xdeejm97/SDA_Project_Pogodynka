package WeatherService;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WeatherApiConnection {
    private final static String BASE_URL = "http://api.weatherstack.com/current?" +
            "access_key=ae7d7285ae1929c07db941e355149670" +
            "&query=Szczecin";

    private String weatherData;

    public String getWeather() throws IOException {

        Request request = new Request.Builder()
                .url(BASE_URL)
                .build();
        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);
        Response response = call.execute();
        weatherData = response.body().string();
        return weatherData;
    }
}
