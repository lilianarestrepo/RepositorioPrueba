package tasks;

import interations.Esperar;
import interations.Insertar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.LoginPages.*;


public class Ingresar implements Task {
    String usuario;
    String passw;

    public Ingresar(String usuario, String passw) {
        this.usuario = usuario;
        this.passw = passw;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
            Esperar.estosSegundos(10),
            Click.on(BTN_INGRESAR),
            Esperar.estosSegundos(5),
            //interations.Enter.sendKeys(usuario).into(TXT_USUARIO),
            Insertar.conElTeclado(usuario).enEnElemento(TXT_USUARIO)


    );






        actor.attemptsTo(
                Esperar.estosSegundos(10)
        );

    }

    public static Ingresar enBancolombia (String  usuario,String passw){
        return instrumented(Ingresar.class,usuario,passw);
    }
}
