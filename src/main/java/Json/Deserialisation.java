package Json;

import Dto.WeatherDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Deserialisation  {
    public static void main(String[] args) throws JsonProcessingException {


        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        WeatherDto WeatherDataJson = objectMapper.readValue(WeatherService.WeatherApiConnection.getWeatherData(), WeatherDto.class);

        System.out.println(WeatherDataJson);


    }


}
