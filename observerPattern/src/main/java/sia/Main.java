package sia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        WeatherData weatherData = new WeatherData();

        Observer displayTemprature = new DisplayData();

        Observer statisticsDisplay = new StatisticsDisplay();

        weatherData.addObserver(displayTemprature);

        weatherData.addObserver(statisticsDisplay);

        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.setMeasurements(80, 65, 30.4f);

    }
}
