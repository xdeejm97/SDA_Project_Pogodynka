package pogodynkaApp;

import java.io.PrintStream;
import java.util.Scanner;

public class WeatherApp {
    private final Scanner scanner = new Scanner(System.in);
    private final PrintStream printStream = new PrintStream((System.out));

    public void run(){
        printStream.println("Hello User!");

        boolean shutdownChosen = false;
        while(!shutdownChosen) {
            printStream.println("MAIN MENU");
            printStream.println("a - add - add new location");
            printStream.println("l - list - list locations");
            printStream.println("s - show - show weather parameters");
            printStream.println("x - exit - application shutdown");

            String option = scanner.nextLine();
            if (option.equals("x") || option.equals("exit")){
                printStream.println("Shutting down");
                shutdownChosen = true;
            } else if (option.equals("a")|| option.equals("add")){
                // TODO: 18.08.2021 tryToAddLocation
            } else if (option.equals("l") || option.equals("list")){
                // TODO: 18.08.2021 tryToListLocations
            } else if (option.equals("s") || option.equals("show")){
                // TODO: 18.08.2021  showWeatherParameters
            }

        }
        printStream.println("Goodbye!");
    }

}
