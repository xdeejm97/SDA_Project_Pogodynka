package WeatherService;

import Utililty.WeatherDto;

import java.io.IOException;

public class WeatherManager {
    private final Deserialisation deserialisation= new Deserialisation();
    private final WeatherApiConnection weatherApiConnection = new WeatherApiConnection();

    public void weatherManagerJSONandDatabase (String cityName) throws IOException {
        String servedResponseEncoded = weatherApiConnection.getWeather(cityName);
        WeatherDto weatherDto = deserialisation.changeStringToMap(servedResponseEncoded);


    }

}
