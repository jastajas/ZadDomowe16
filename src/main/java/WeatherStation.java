import java.util.Random;

public class WeatherStation {
    private Random rnd;
    private int temp;
    private int weatherDescription;

    public WeatherStation(){
        rnd = new Random();
        temp = rnd.nextInt(35) * (rnd.nextBoolean()? -1: 1);
        weatherDescription = rnd.nextInt(3);
        System.out.println("Stacja pogodowa pobiera informacje o temperaturze.");
    }

    public int getTemp() {
        return temp;
    }

    public String getWeatherDescription() {
        String description = "";
        switch (weatherDescription) {
            case 0:
                description = WeatherDescription.SUN.toString();
                break;
            case 1:
                description = WeatherDescription.CLOUDS.toString();
                break;
            case 2:
                description = WeatherDescription.RAIN.toString();
                break;
            default:
                description = WeatherDescription.STORM.toString();
        }
        return description;
    }

}
