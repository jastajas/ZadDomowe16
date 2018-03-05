package jastajas.ZadDomowe16;

import jastajas.ZadDomowe16.BlindsController;
import jastajas.ZadDomowe16.BoilerController;
import jastajas.ZadDomowe16.SpeakerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartHome {
    SpeakerController speakerController;
    BoilerController boilerController;
    BlindsController blindsController;

    @Autowired
    public SmartHome(SpeakerController speakerController, BoilerController boilerController, BlindsController blindsController) {
        this.speakerController = speakerController;
        this.boilerController = boilerController;
        this.blindsController = blindsController;
    }

    public void runSmartHome(){
        speakerController.inform();
        boilerController.autoBoilerPower();
        blindsController.setWindowBlinds();
    }

}
