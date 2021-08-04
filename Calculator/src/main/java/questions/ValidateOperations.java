package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateOperations implements Question<Boolean> {

    private String numberOne;
    private String numberTwo;

    public ValidateOperations(String numberOne, String numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (numberOne.equals(numberTwo)){
            return true;
        }
        return false;
    }

    public static ValidateOperations inTheCalculator(String numberOne, String numberTwo){
        return  new ValidateOperations(numberOne,numberTwo);
    }
}
