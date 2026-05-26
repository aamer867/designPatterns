package sia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        WeatherData weatherData = new WeatherData();
        Observer observer = new DisplayTemprature();

        weatherData.addObserver(observer);
        weatherData.setTemperature(20.5f);

        weatherData.setHumidity(50.5f);

        weatherData.setPressure(1013.25f);

        weatherData.notifyObservers();

    }
}
