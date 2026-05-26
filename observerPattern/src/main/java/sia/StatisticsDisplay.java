package sia;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayObserver {
    private List<Float> tempratureData;
    private List<Float> humidityData;
    private List<Float> pressureData;

    public StatisticsDisplay() {
        tempratureData = new ArrayList<>();
        humidityData = new ArrayList<>();
        pressureData = new ArrayList<>();
    }

    public void update(float temperature, float humidity, float pressure) {
        tempratureData.add(temperature);
        humidityData.add(humidity);
        pressureData.add(pressure);
        display();
    }

    public void display() {
        System.out.printf("MIN/Max/AVG temperature = %.2f/%.2f/%.2f", tempratureData.stream().min(Float::compare).orElseThrow(),
                tempratureData.stream().max(Float::compare).orElseThrow(),
                tempratureData.stream().mapToDouble(Float::doubleValue).average().getAsDouble());

        System.out.printf("MIN/Max/AVG humadity = %.2f/%.2f/%.2f", humidityData.stream().min(Float::compare).orElseThrow(),
                humidityData.stream().max(Float::compare).orElseThrow(),
                humidityData.stream().mapToDouble(Float::doubleValue).average().getAsDouble());

        System.out.printf("MIN/Max/AVG pressure = %.2f/%.2f/%.2f", pressureData.stream().min(Float::compare).orElseThrow(),
                pressureData.stream().max(Float::compare).orElseThrow(),
                pressureData.stream().mapToDouble(Float::doubleValue).average().getAsDouble());
    }

}
