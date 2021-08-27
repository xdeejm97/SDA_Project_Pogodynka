package Repository;

import utililty.WeatherDto;
import utililty.WeatherEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

//java -cp C:\Users\damia\.m2\repository\com\h2database\h2\1.4.200\h2-1.4.200.jar org.h2.tools.Server -> odpalenie bazy danych H2 wpisać w konsoli ctrl + c (zatrzymuje klienta bazy H2)
public class WeatherRepository {
    private EntityManager entityManager;

    public WeatherRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public WeatherEntity saveToDatabase(WeatherDto weatherDto, WeatherEntity weatherEntity) {
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            weatherEntity.setName(weatherDto.getLocationDto().getName());
            weatherEntity.setCountry(weatherDto.getLocationDto().getCountry());
            weatherEntity.setLat(weatherDto.getLocationDto().getLat());
            weatherEntity.setLon(weatherDto.getLocationDto().getLon());
            weatherEntity.setTemperature(weatherDto.getCurrentDto().getTemperature());
            weatherEntity.setWind_speed(weatherDto.getCurrentDto().getWind_speed());
            weatherEntity.setWind_dir(weatherDto.getCurrentDto().getWind_dir());
            weatherEntity.setPressure(weatherDto.getCurrentDto().getPressure());
            weatherEntity.setHumidity(weatherDto.getCurrentDto().getHumidity());
            entityManager.persist(weatherEntity);
            transaction.commit();
            return weatherEntity;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    public List<WeatherEntity> listAllNames() {
        //String query = "SELECT name FROM weather_parameters";
        return entityManager.createQuery("FROM WeatherEntity", WeatherEntity.class).getResultList();
    }
}
