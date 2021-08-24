package pogodynkaApp;

import Repository.WeatherRepository;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import utililty.WeatherDto;
import utililty.WeatherEntity;

public class AppRunner {
    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();

        weatherApp.run();
    }
}
