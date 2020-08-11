package co.com.choucair.certification.screenplayreto03.tasks;

import co.com.choucair.certification.screenplayreto03.model.RegisterDataForAppointment;
import co.com.choucair.certification.screenplayreto03.userinterface.RegistryPageByDate;
import co.com.choucair.certification.screenplayreto03.userinterface.AdminPageByHospital;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegisterOfAppointment implements Task {

    private static RegisterDataForAppointment registerDataForAppointment;

    public static RegisterOfAppointment newDate(List<RegisterDataForAppointment> RegisterDataForAppointment){
        registerDataForAppointment = RegisterDataForAppointment.get(0);
        return Tasks.instrumented(RegisterOfAppointment.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AdminPageByHospital.NEW_DATE_BTN),
                Enter.theValue(registerDataForAppointment.getDate()).into(RegistryPageByDate.DATE_DAY_DP),
                Enter.theValue(registerDataForAppointment.getPatientID()).into(RegistryPageByDate.PATIENT_ID_INPUT),
                Enter.theValue(registerDataForAppointment.getDoctorID()).into(RegistryPageByDate.DOCTOR_ID_INPUT),
                Enter.theValue(registerDataForAppointment.getObservations()).into(RegistryPageByDate.OBSERVATION_TEXT),
                Click.on(RegistryPageByDate.SAVE_BTN));
    }
}
