import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {
    @Test
    public void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.01);
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.01);
    }


    @Test
    public void fahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.01);
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.01);
    }

    @Test
    public void isExtremeTemperature() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(true, converter.isExtremeTemperature(-41));
        assertEquals(true, converter.isExtremeTemperature(51));
        assertEquals(false, converter.isExtremeTemperature(20));
    }

    @Test
    public void kelvinToCelsius() {
        assertEquals(26.85, TemperatureConverter.kelvinToCelsius(300), 0.01);
    }

}