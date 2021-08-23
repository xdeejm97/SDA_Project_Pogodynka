package pogodynkaApp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class LocationService {
    private final List<LocationInfo> locationInfoList = new ArrayList<>();

    public void addLocationInfo (LocationInfo locationInfo){
        locationInfoList.add(locationInfo);
    }

    public List<LocationInfo> getLocations() {
        return new ArrayList<>(locationInfoList);
    }


}
