package ui;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPages {

    public static final Target BTN_INGRESAR = Target.the("").locatedBy("//*[@text='INGRESAR']");
    public static final Target TXT_USUARIO = Target.the("").locatedBy("//android.widget.EditText[@resource-id='Input_Username_UserAuth']");

            //MobileBy.id("Input_Username_UserAuth"));
            //locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
    public static final Target BTN_CONTINUAR = Target.the("").located(By.id("Button_Continue_UserAuth"));
    public static final Target TXT_PASS = Target.the("").located(By.className("android.view.View"));
    public static final Target BTN_CONTINUAR1 = Target.the("").located(By.id("Button_Continue_UserAuth"));
}
