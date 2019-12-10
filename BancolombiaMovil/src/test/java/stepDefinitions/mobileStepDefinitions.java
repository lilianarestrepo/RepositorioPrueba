package stepDefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import drivers.AppiumDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Ingresar;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class mobileStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario esta en la app Bancolombia$")
    public void queElUsuarioEstaEnLaAppBancolombia() {

            theActorCalled("mobile").can(BrowseTheWeb.with(AppiumDriver.suNavegador().on()));
    }


    @Cuando("^ingresa los datos de login$")
        public void ingresaLosDatosDeLogin(List<String>data)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.enBancolombia(data.get(2), data.get(3)));
    }


    @Entonces("^el podra ingresar exitasamente a los productos bancolombia$")
    public void elPodraIngresarExitasamenteALosProductosBancolombia()  {
    }

}
