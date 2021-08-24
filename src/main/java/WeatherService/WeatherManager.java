package WeatherService;

import Repository.WeatherRepository;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import utililty.WeatherDto;
import utililty.WeatherEntity;

import java.io.IOException;

public class WeatherManager {
    private final Deserialisation deserialisation = new Deserialisation();
    private final WeatherApiConnection weatherApiConnection = new WeatherApiConnection();

    public void weatherManagerJSONandDatabase(String cityName, WeatherEntity weatherEntity) throws IOException {
        String servedResponseEncoded = weatherApiConnection.getWeather(cityName);
        WeatherDto weatherDto = deserialisation.changeStringToMap(servedResponseEncoded);

        System.out.println(weatherDto);
        SessionFactory sessionFactory = new Configuration() //zmiany po kursie
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(WeatherEntity.class)
                .buildSessionFactory();

        saving(sessionFactory, weatherDto, weatherEntity);
        System.out.println(weatherEntity);


    }

    private static void saving(SessionFactory sessionFactory1, WeatherDto weatherDto, WeatherEntity weatherEntity) {
        WeatherRepository weatherRepository = new WeatherRepository(sessionFactory1.createEntityManager());
        weatherRepository.saveToDatabase(weatherDto, weatherEntity);
    }

}

