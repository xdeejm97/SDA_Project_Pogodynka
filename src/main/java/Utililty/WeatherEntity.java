package Utililty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

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
    private String longitude;
    private String latitude;
    private String city;
    private String country;
    private long temperature;
    private int pressure;
    private int humidity;
    @Column(name = "wind_direction")
    private String windDirection;
    @Column(name = "wind_speed")
    private int windSpeed;
}

