import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean
    public WeatherStation weatherStation(){
        return new WeatherStation();
    }

    @Bean
    public BoilerController boilerController(WeatherStation weatherStation){
        return new BoilerController(weatherStation);
    }

    @Bean
    public SpeakerController speakerController(WeatherStation weatherStation){
        return new SpeakerController(weatherStation);
    }

    @Bean
    public BlindsController blindsController(WeatherStation weatherStation){
        return new BlindsController(weatherStation);
    }

    @Bean
    public SmartHome smartHome(SpeakerController speakerController, BoilerController boilerController,
                               BlindsController blindsController){
        return new SmartHome(speakerController, boilerController, blindsController);
    }

}
