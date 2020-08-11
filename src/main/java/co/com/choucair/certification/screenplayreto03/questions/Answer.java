package co.com.choucair.certification.screenplayreto03.questions;

import co.com.choucair.certification.screenplayreto03.userinterface.AdminPageByHospital;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer (String question) {
        this.question = question;
    }

    public static Answer theRegistryValidation(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean result;

        String verifyLbl = Text.of(AdminPageByHospital.MSG_VERIFY_LBL).viewedBy(actor).asString();

        if(verifyLbl.contains(question)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
