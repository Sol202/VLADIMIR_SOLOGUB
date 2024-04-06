package homework_nr_4;

public class TemperatureConverter {
    static double fahrenheit;
    static double celsius;

    public static void main(String[] args) {
        double celsius = 11;
        double fahrenheit = toFahrenheit(celsius);
        System.out.println(celsius + " Celsius degrees  = " + fahrenheit + " Fahrenheit degrees ");

        double fahrenheit1 = 68;
        double celsius1 = toCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit degrees  = " + celsius + " Celsius degrees");


    }
    public static double toFahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    public static double toCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
}
