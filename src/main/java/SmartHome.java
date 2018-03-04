public class SmartHome {
    SpeakerController speakerController;
    BoilerController boilerController;
    BlindsController blindsController;

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
