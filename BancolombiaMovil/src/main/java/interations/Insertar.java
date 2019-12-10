package interations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import util.moviles.UtilidadesMoviles;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Insertar implements Interaction {

    private String cadena;
    private Target target;

    public Insertar(String cadena) {
        this.cadena = cadena;
    }

    public Insertar enEnElemento(Target target){
        this.target = target;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
        for(int i = 0; i < cadena.length(); i++)
        {
            UtilidadesMoviles.pressKeyInAndroid(String.valueOf(cadena.indexOf(i)));
        }
    }

    public static Insertar conElTeclado (String cadena){
        return instrumented(Insertar.class,cadena);
    }
}
