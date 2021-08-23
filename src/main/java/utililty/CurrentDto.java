package utililty;


public class CurrentDto {
    private long temperature;
    private int wind_speed;
    private String wind_dir;
    private int pressure;
    private int humidity;


    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    public int getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(int wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
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

    @Override
    public String toString() {
        return "CurrentDto{" +
                "temperature=" + temperature +
                ", wind_speed=" + wind_speed +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
