package co.com.choucair.certification.screenplayreto03.tasks;

import co.com.choucair.certification.screenplayreto03.model.RegisterDataForDoctor;
import co.com.choucair.certification.screenplayreto03.userinterface.RegistryPageByDoctor;
import co.com.choucair.certification.screenplayreto03.userinterface.AdminPageByHospital;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class RegisterOfDoctor implements Task {

    private static RegisterDataForDoctor registerDataForDoctor;

    public static RegisterOfDoctor newDoctor(List<RegisterDataForDoctor> RegisterDataForDoctor) {
        registerDataForDoctor = RegisterDataForDoctor.get(0);
        return Tasks.instrumented(RegisterOfDoctor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AdminPageByHospital.NEW_DOCTOR_BTN),
                Enter.theValue(registerDataForDoctor.getName()).into(RegistryPageByDoctor.NAME_INPUT),
                Enter.theValue(registerDataForDoctor.getLastname()).into(RegistryPageByDoctor.LASTNAME_INPUT),
                Enter.theValue(registerDataForDoctor.getPhone()).into(RegistryPageByDoctor.PHONE_INPUT),
                SelectFromOptions.byVisibleText(registerDataForDoctor.getDocType()).from(RegistryPageByDoctor.IDTYPE_DROP),
                Enter.theValue(registerDataForDoctor.getDocNumber()).into(RegistryPageByDoctor.ID_INPUT),
                Click.on(RegistryPageByDoctor.SAVE_BTN));
    }
}
