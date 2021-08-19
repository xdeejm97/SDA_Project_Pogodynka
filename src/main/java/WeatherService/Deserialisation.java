package WeatherService;

import Utililty.WeatherDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Deserialisation {

    public WeatherDto changeStringToMap(String dataFromWAC) throws JsonProcessingException {
        WeatherApiConnection weatherApiConnection = new WeatherApiConnection();
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        WeatherDto weatherDataJson = objectMapper.readValue(dataFromWAC, WeatherDto.class);
        System.out.println(weatherDataJson);
        return weatherDataJson;
    }

}
