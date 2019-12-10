package interations;

import drivers.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.time.Duration;


public class Scroll implements Interaction {

    private int yI,yF;

    public Scroll(int yI, int yF) {
        this.yI = yI;
        this.yF = yF;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        TouchAction action = new TouchAction(AppiumDriver.driver);
        action.press(PointOption
                .point(60, yI))
                .waitAction(WaitOptions
                        .waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption
                        .point(60, yF)).release().perform();
    }

    public static Performable down(int yI, int yF)
    {
        return Instrumented.instanceOf(Scroll.class).withProperties(yI,yF);
    }
}
