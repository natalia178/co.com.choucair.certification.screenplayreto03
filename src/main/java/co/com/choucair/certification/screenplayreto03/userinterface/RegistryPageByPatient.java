package co.com.choucair.certification.screenplayreto03.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistryPageByPatient extends PageObject {

    public static final Target NAME_INPUT =
            Target.the("name input field")
                    .located(By.name("name"));
    public static final Target LASTNAME_INPUT =
            Target.the("lastname input field")
                    .located(By.name("last_name"));
    public static final Target PHONE_NUMBER =
            Target.the("phone number input field")
                    .located(By.name("telephone"));
    public static final Target IDTYPE_DROP =
            Target.the("id type dropdown selector")
                    .located(By.name("identification_type"));
    public static final Target ID_INPUT =
            Target.the("id number input field")
                    .located(By.name("identification"));
    public static final Target PRAPAYD_CB =
            Target.the("prepay check box")
                    .located(By.name("prepaid"));
    public static final Target SAVE_BTN =
            Target.the("add doctor button")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));
}
