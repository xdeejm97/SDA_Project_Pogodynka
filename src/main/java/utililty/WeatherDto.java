package utililty;

import com.fasterxml.jackson.annotation.JsonGetter;

public class WeatherDto {
    private LocationDto locationDto;
    private CurrentDto currentDto;

    @JsonGetter("location")
    public LocationDto getLocationDto() {
        return locationDto;
    }

    public void setLocationDto(LocationDto locationDto) {
        this.locationDto = locationDto;
    }

    @JsonGetter("current")
    public CurrentDto getCurrentDto() {
        return currentDto;
    }

    public void setCurrentDto(CurrentDto currentDto) {
        this.currentDto = currentDto;
    }

    @Override
    public String toString() {
        return "WeatherDto{" +
                "locationDto=" + locationDto +
                ", currentDto=" + currentDto +
                '}';
    }
}
