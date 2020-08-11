package co.com.choucair.certification.screenplayreto03.tasks;

import co.com.choucair.certification.screenplayreto03.model.RegisterDataForPatient;
import co.com.choucair.certification.screenplayreto03.userinterface.AdminPageByHospital;
import co.com.choucair.certification.screenplayreto03.userinterface.RegistryPageByPatient;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class RegisterOfPatient implements Task {

    private static RegisterDataForPatient registerDataForPatient;

    public static RegisterOfPatient newPatient(List<RegisterDataForPatient> RegisterDataForPatient) {
        registerDataForPatient = RegisterDataForPatient.get(0);
        return Tasks.instrumented(RegisterOfPatient.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AdminPageByHospital.NEW_PATIENT_BTN),
                Enter.theValue(registerDataForPatient.getName()).into(RegistryPageByPatient.NAME_INPUT),
                Enter.theValue(registerDataForPatient.getLastname()).into(RegistryPageByPatient.LASTNAME_INPUT),
                Enter.theValue(registerDataForPatient.getPhone()).into(RegistryPageByPatient.PHONE_NUMBER),
                SelectFromOptions.byVisibleText(registerDataForPatient.getDocType()).from(RegistryPageByPatient.IDTYPE_DROP),
                Enter.theValue(registerDataForPatient.getDocNumber()).into(RegistryPageByPatient.ID_INPUT)
                );
        if(registerDataForPatient.getPrepaid().equals("si")){
            actor.attemptsTo(Click.on(RegistryPageByPatient.PRAPAYD_CB));
        }
        actor.attemptsTo(Click.on(RegistryPageByPatient.SAVE_BTN));
    }
}
