package WeatherService;

import utililty.WeatherDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Deserialisation {

    public WeatherDto changeStringToMap(String dataFromWAC) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        WeatherDto weatherDataJson = objectMapper.readValue(dataFromWAC, WeatherDto.class);
        return weatherDataJson;
    }

}
