package jastajas.ZadDomowe16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BlindsController {
    WeatherStation weatherStation;
    boolean opendBlinds;

    @Autowired
    public BlindsController(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void setWindowBlinds(){
        String sunStatus = "";
        if (!weatherStation.getWeatherDescription().equals("słonecznie")){
            openBlinds();
            sunStatus = "Nie ma słońca.";
        } else {
            closeBlinds();
            sunStatus = "Jest słonecznie. ";
        }
        System.out.println(sunStatus + this.toString());
    }

    public void openBlinds() {
        opendBlinds = true;
    }

    public void closeBlinds() {
        opendBlinds = false;
    }

    @Override
    public String toString() {
        return "Rolety odsłonięte: " + opendBlinds;
    }
}
