public class Main {

    public  static void main(String[] args) {

        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = 150.0;
        double celsius = converter.fahrenheitToCelsius((fahrenheit));
        System.out.println(fahrenheit + "°F is " + celsius + "°C");
        System.out.println();

        System.out.println("Is " + celsius + "°C an extreme temperature? " + converter.isExtremeTemperature(celsius));
        System.out.println();

        double newFahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is " + newFahrenheit + "°F");
    }
}
