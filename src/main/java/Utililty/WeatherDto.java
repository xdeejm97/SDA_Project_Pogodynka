package Utililty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {
    private int id;
    private String name;
    private String country;
    private String lat;
    private String lon;
    private long temperature;
    private int wind_speed;
    private String wind_dir;
    private int pressure;
    private int humidity;




}
