public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    public boolean isExtremeTemperature(double celsius) {
        if (celsius < -40) {
            return true;
        }
        else if (celsius > 50) {
            return true;
        }
        else {
            return false;
        }
    }


    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

}
