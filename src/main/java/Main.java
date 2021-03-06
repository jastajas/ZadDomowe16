import jastajas.ZadDomowe16.ConfigApp;
import jastajas.ZadDomowe16.SmartHome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        SmartHome smartHome = context.getBean(SmartHome.class);

        smartHome.runSmartHome();
    }
}
