package co.com.choucair.certification.screenplayreto03.tasks;

import co.com.choucair.certification.screenplayreto03.userinterface.AdminPageByHospital;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class StartUpWebPage implements Task {

    AdminPageByHospital adminPageByHospital;

    public static StartUpWebPage thePage() {
        return Tasks.instrumented(StartUpWebPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(adminPageByHospital));
    }
}
