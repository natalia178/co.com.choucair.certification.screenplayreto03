package co.com.choucair.certification.screenplayreto03.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistryPageByDoctor extends PageObject {

    public static final Target NAME_INPUT =
            Target.the("Name input field")
                    .located(By.id("name"));
    public static final Target LASTNAME_INPUT =
            Target.the("lastname input field")
                    .located(By.id("last_name"));
    public static final Target PHONE_INPUT =
            Target.the("phone number input field")
                    .located(By.id("telephone"));
    public static final Target IDTYPE_DROP =
            Target.the("id type dropdown selector")
                    .located(By.id("identification_type"));
    public static final Target ID_INPUT =
            Target.the("id number input field")
                    .located(By.id("identification"));
    public static final Target SAVE_BTN =
            Target.the("add doctor button")
                    .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));
}
