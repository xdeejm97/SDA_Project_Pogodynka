package WeatherService;

import Utililty.WeatherDto;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Deserialisation {

    public WeatherDto checkWeather() {
        WeatherApiConnection weatherApiConnection = new WeatherApiConnection();
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        WeatherDto weatherDataJson = objectMapper.readValue(weatherApiConnection.getWeather(), WeatherDto.class);
        return weatherDataJson;
    }

}
