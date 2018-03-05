package jastajas.ZadDomowe16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoilerController {

    private WeatherStation weatherStation;
    private boolean boilerPower;

    @Autowired
    public BoilerController(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void autoBoilerPower(){
        String warmCold = "";
        if (weatherStation.getTemp() < 15){
            turnOn();
            warmCold = "zimno";
        } else {
            turnOff();
            warmCold = "ciepło";
        }
        System.out.println("Jest " + warmCold + ". " + this.toString());
    }

    public void turnOn(){
        boilerPower = true;
    }

    public void turnOff(){
        boilerPower = false;
    }

    @Override
    public String toString() {
        return "Piec włączony: " + boilerPower;
    }
}
