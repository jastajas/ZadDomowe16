public class SpeakerController {

    public WeatherStation weatherStation;

    public SpeakerController(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void inform(){
        String wish="dobry";
        if (weatherStation.getWeatherDescription() != "słonecznie"){
            wish = "ponury";
        }

            System.out.println("Dzień dobry. Dzisiejsza temperatura: " + weatherStation.getTemp() +
                    "st.C i jest " + weatherStation.getWeatherDescription() + ". To będzie " + wish + " dzień!");

    }

}
