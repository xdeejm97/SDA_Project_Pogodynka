package pogodynkaApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class LocationInfo {

    //private Integer id;
    private String city;
//    private String country;
//    private String geograficalWidth;
//    private String geograficalLength;
//    private long temperature;

    public LocationInfo(String city) {
        this.city = city;
    }
}
