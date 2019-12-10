package interations;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class Enter implements Interaction {
    private Target target;
    private String texto;

    public Enter(String texto) {
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).sendKeys(texto);

    }

    public static Enter sendKeys(String texto)
    {
        return Instrumented.instanceOf(Enter.class).withProperties(texto);
    }

    public Enter into(Target target)
    {
        this.target = target;
        return this;
    }
}
