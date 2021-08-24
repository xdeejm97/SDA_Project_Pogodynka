package pogodynkaApp;

import Repository.WeatherRepository;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import utililty.WeatherDto;
import utililty.WeatherEntity;

public class AppRunner {

    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(WeatherEntity.class)
                .buildSessionFactory();

        weatherApp.run(sessionFactory);


    }
}
