package WeatherService;

import java.io.IOException;

public class WeatherManager {
    private final Deserialisation deserialisation= new Deserialisation();
    private final WeatherApiConnection weatherApiConnection = new WeatherApiConnection();

    public WeatherManager (String cityName) throws IOException {
        weatherApiConnection.getWeather(cityName);


    }

}
