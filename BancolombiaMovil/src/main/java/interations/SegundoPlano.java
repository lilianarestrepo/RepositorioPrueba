package interations;

import drivers.AppiumDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.time.Duration;


public class SegundoPlano implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver.driver.runAppInBackground(Duration.ofSeconds(3));
        actor.attemptsTo(Esperar.estosSegundos(3  ));
    }

    public static Performable on()
    {
        return Instrumented.instanceOf(SegundoPlano.class).withProperties();
    }
}
