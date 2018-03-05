package jastajas.ZadDomowe16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpeakerController {

    public WeatherStation weatherStation;

    @Autowired
    public SpeakerController(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void inform(){
        String wish="dobry";
        if (!weatherStation.getWeatherDescription().equals("słonecznie")){
            wish = "ponury";
        }

            System.out.println("Dzień dobry. Dzisiejsza temperatura: " + weatherStation.getTemp() +
                    "st.C i jest " + weatherStation.getWeatherDescription() + ". To będzie " + wish + " dzień!");

    }

}
