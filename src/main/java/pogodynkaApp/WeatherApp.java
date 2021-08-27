package pogodynkaApp;

import Repository.WeatherRepository;
import WeatherService.WeatherManager;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import utililty.WeatherDto;
import utililty.WeatherEntity;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class WeatherApp {
    private final Scanner scanner = new Scanner(System.in);
    private final PrintStream printStream = new PrintStream((System.out));
    private final LocationService locationService = new LocationService();
    private final WeatherManager weatherManager = new WeatherManager();
    //private WeatherEntity weatherEntity = new WeatherEntity();



    public void run(SessionFactory sessionFactory) {
        printStream.println("Hello User!");

        boolean shutdownChosen = false;
        while (!shutdownChosen) {
            printStream.println("MAIN MENU");
            printStream.println("a - add - add new location");
            printStream.println("l - list - list locations");
            printStream.println("s - show - show weather parameters");
            printStream.println("x - exit - application shutdown");

            String option = scanner.nextLine();
            if (option.equals("x") || option.equals("exit")) {
                printStream.println("Shutting down");
                shutdownChosen = true;
            } else if (option.equals("a") || option.equals("add")) {
                tryToAddLocation(sessionFactory);
            } else if (option.equals("l") || option.equals("list")) {
                tryToListLocations(sessionFactory);
            } else if (option.equals("s") || option.equals("show")) {
                // TODO: 18.08.2021  showWeatherParameters
            }

        }
        printStream.println("Goodbye!");
    }

    private void tryToAddLocation(SessionFactory sessionFactory) {
        WeatherEntity weatherEntity = new WeatherEntity();
        printStream.println("Adding new location");

        printStream.println("Enter city:");
        String enteredCity = scanner.nextLine();
        try {
            //LocationInfo writtenCity = new LocationInfo(enteredCity);
        } catch (NullPointerException e) {
            printStream.println("City cannot be empty!");
            return;
        }

        LocationInfo currentLocation = new LocationInfo(enteredCity);


        printStream.println("City " + enteredCity + " has been added!");


        try {
            weatherManager.weatherManagerJSONandDatabase(enteredCity, weatherEntity, sessionFactory);
        } catch (IOException e) {
            System.out.println("Problem with weatherManagerJSONandDatabase!");
            e.printStackTrace();
        }

        locationService.addLocationInfo(currentLocation);
    }

    private void tryToListLocations(SessionFactory sessionFactory) {
//        printStream.println("Listing locations");
//
        WeatherRepository weatherRepository = new WeatherRepository(sessionFactory.createEntityManager());
        List<WeatherEntity> printCities = weatherRepository.listAllNames();
        for (WeatherEntity cities : printCities){
            System.out.println(cities.getName() + " " + cities.getTemperature()+ " st.C");
        }

////
////        List<WeatherEntity> printedLocationFromWeatherRepository= weatherRepository.listAllNames();
////        System.out.println(printedLocationFromWeatherRepository);
////        printedLocationFromWeatherRepository.forEach(weatherEntity -> log.info(weatherEntity.toString()));
//
////        printedLocationFromWeatherRepository.forEach(printStream::println);
//
//        List<LocationInfo> printedLocations = locationService.getLocations();
//        printedLocations.forEach(printStream::println);

     }


}
