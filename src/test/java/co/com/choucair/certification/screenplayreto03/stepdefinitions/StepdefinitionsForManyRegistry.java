package co.com.choucair.certification.screenplayreto03.stepdefinitions;

import co.com.choucair.certification.screenplayreto03.model.RegisterDataForAppointment;
import co.com.choucair.certification.screenplayreto03.model.RegisterDataForDoctor;
import co.com.choucair.certification.screenplayreto03.model.RegisterDataForPatient;
import co.com.choucair.certification.screenplayreto03.questions.Answer;
import co.com.choucair.certification.screenplayreto03.tasks.RegisterOfAppointment;
import co.com.choucair.certification.screenplayreto03.tasks.StartUpWebPage;
import co.com.choucair.certification.screenplayreto03.tasks.RegisterOfDoctor;
import co.com.choucair.certification.screenplayreto03.tasks.RegisterOfPatient;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepdefinitionsForManyRegistry {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Natalia need to register a new doctor$")
    public void thanNataliaNeedToRegisterANewDoctor() {
        OnStage.theActorCalled("Natalia").wasAbleTo(StartUpWebPage.thePage());
    }

    @When("^he fill the doctor registry form in the app$")
    public void heFillTheDoctorRegistryFormInTheApp(List<RegisterDataForDoctor> RegisterDataForDoctor) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterOfDoctor.newDoctor(RegisterDataForDoctor));
    }

    @Then("^he verify that the screen show the mesage (.*)$")
    public void heVerifyThatTheScreenShowTheMesageDatosGuardadosCorrectamente(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.theRegistryValidation(question)));
    }

    @Given("^than Natalia add a new patient$")
    public void thanNataliaAddANewPatient() {
        OnStage.theActorCalled("Natalia").wasAbleTo(StartUpWebPage.thePage());
    }

    @When("^he fill the patient registry form in the app$")
    public void heFillThePatientRegistryFormInTheApp(List<RegisterDataForPatient> RegisterDataForPatient) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterOfPatient.newPatient(RegisterDataForPatient));
    }

    @Given("^than Natalia want to make a new date$")
    public void thanNataliaWantToMakeANewDate() {
        OnStage.theActorCalled("Natalia").wasAbleTo(StartUpWebPage.thePage());
    }

    @When("^he fill the date registry form in the app$")
    public void heFillTheDateRegistryFormInTheApp(List<RegisterDataForAppointment> RegisterDataForAppointment) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterOfAppointment.newDate(RegisterDataForAppointment));
    }
}
