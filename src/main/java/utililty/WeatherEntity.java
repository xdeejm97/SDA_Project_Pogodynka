package utililty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "weather_parameters")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode // @EqualsAndHashCode(callSuper = true)
public class WeatherEntity {

    @Id
    @GeneratedValue

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

