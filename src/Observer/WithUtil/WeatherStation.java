package Observer.WithUtil;

import Observer.GoodExample.CurrentConditionalDisplay;
import Observer.GoodExample.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionalDisplay currentDisplay = new CurrentConditionalDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.f);
        weatherData.setMeasurements(82, 70,29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
