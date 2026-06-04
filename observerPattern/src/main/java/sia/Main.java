package sia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        WeatherData weatherData = new WeatherData();

        Observer displayTemperature = new DisplayData();

        Observer statisticsDisplay = new StatisticsDisplay();

        weatherData.addObserver(displayTemperature);

        weatherData.addObserver(statisticsDisplay);

        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.setMeasurements(80, 65, 30.4f);

    }
}
