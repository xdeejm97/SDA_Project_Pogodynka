package pogodynkaApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationInfo {

    private int id;
    private String city;
    private String geograficalLength;
    private String geograficalWidth;
    private String country;

    public LocationInfo(String city) {
        this.city = city;
    }
}
