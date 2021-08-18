package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
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
    private String windDirection;
    private int windSpeed;

    public WeatherEntity(int id, String longitude, String latitude, String city, String country, long temperature, int pressure, int humidity, String windDirection, int windSpeed) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.city = city;
        this.country = country;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherEntity that = (WeatherEntity) o;
        return id == that.id && temperature == that.temperature && pressure == that.pressure && humidity == that.humidity && windSpeed == that.windSpeed && Objects.equals(longitude, that.longitude) && Objects.equals(latitude, that.latitude) && Objects.equals(city, that.city) && Objects.equals(country, that.country) && Objects.equals(windDirection, that.windDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, longitude, latitude, city, country, temperature, pressure, humidity, windDirection, windSpeed);
    }
}
