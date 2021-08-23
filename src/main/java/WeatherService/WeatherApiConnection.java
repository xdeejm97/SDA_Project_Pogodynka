package WeatherService;

import lombok.Data;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

@Data
public class WeatherApiConnection {
    private static String BASE_URL = "http://api.weatherstack.com/current?" +
            "access_key=ae7d7285ae1929c07db941e355149670" +
            "&query=";

    private String weatherData;

    public String getWeather(String cityName) throws IOException {

        Request request = new Request.Builder()
                .url(BASE_URL + cityName)
                .build();
        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);
        Response response = call.execute();
        weatherData = response.body().string();
        return weatherData;
    }


}
