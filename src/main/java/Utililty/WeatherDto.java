package Utililty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {
    private int id;
    private String longitude;
    private String latitude;
    private String city;
    private String country;
    private long temperature;
    private int pressure;
    private int humidity;
    private String windDirection;
    private int windSpeed;


}
