import java.time.Duration;
import java.time.LocalDateTime;

public class TestAppelTelephonique {

    public static void main(String[] args) {
        AppelTelephonique appel1 = new AppelTelephonique(LocalDateTime.now(),"0485 42 79 14", Duration.ofSeconds(61,0),0.25);
        AppelTelephonique appel2 = new AppelTelephonique(LocalDateTime.now(),"0486 11 78 65", Duration.ofSeconds(200,0));


        System.out.println("Appel n°1");
        System.out.println(appel1);

        System.out.println();
        System.out.println("Appel n°2");
        System.out.println(appel2);



    }
}
