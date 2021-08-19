package WeatherService;

import Utililty.WeatherDto;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Deserialisation {

    public Deserialisation() throws IOException {
        WeatherApiConnection weatherApiConnection = new WeatherApiConnection();
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        WeatherDto WeatherDataJson = objectMapper.readValue(weatherApiConnection.getWeather(), WeatherDto.class);
    }

}
