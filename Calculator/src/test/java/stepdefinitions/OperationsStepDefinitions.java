package stepdefinitions;
import static models.ResultOperations.getResultSum;
import static models.ResultOperations.getResultsubtraction;
import static models.ResultOperations.getResultDivision;
import static models.ResultOperations.getResultMultiplication;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import hooks.BaseMobileTest;
import questions.ValidateOperations;
import tasks.PerformOperation;

public class OperationsStepDefinitions {

    @Dado("^que el usuario usuario abre la calculadora$")
    public void queElUsuarioUsuarioAbreLaCalculadora() {
        BaseMobileTest baseAppium = new BaseMobileTest();
        baseAppium.environmentSetUp();
    }

    @Cuando("^le realiza la operacion suma entre \"([^\"]*)\" y \"([^\"]*)\"$")
    public void leRealizaLaOperacionSumaEntreY(String numberOne, String numberTwo) {
        PerformOperation.sum(numberOne,numberTwo);
    }

    @Entonces("^deberia ver el resultado \"([^\"]*)\"$")
    public void deberiaVerElResultado(String number) {
       ValidateOperations.inTheCalculator(getResultSum(),number);
    }

    @Cuando("^le realiza la operacion resta entre \"([^\"]*)\" y \"([^\"]*)\"$")
    public void leRealizaLaOperacionRestaEntreY(String numberOne, String numberTwo) {
        PerformOperation.subtraction(numberOne,numberTwo);
    }
    @Entonces("^deberia ver el resultado \"([^\"]*)\" en la resta$")
    public void deberiaVerElResultadoEnLaResta(String number) {
        ValidateOperations.inTheCalculator(getResultsubtraction(),number);
    }

    @Cuando("^le realiza la operacion multiplicacion entre \"([^\"]*)\" y \"([^\"]*)\"$")
    public void leRealizaLaOperacionMultiplicacionEntreY(String numberOne, String numberTwo) {
        PerformOperation.multiplication(numberOne,numberTwo);
    }
    @Entonces("^deberia ver el resultado \"([^\"]*)\" en la multiplicacion$")
    public void deberiaVerElResultadoEnLaMultiplicacion(String number) {
        ValidateOperations.inTheCalculator(getResultMultiplication(),number);
    }

    @Cuando("^le realiza la operacion division entre \"([^\"]*)\" y \"([^\"]*)\"$")
    public void leRealizaLaOperacionDivisionEntreY(String numberOne, String numberTwo) {
        PerformOperation.division(numberOne,numberTwo);
    }

    @Entonces("^deberia ver el resultado \"([^\"]*)\" en la division$")
    public void deberiaVerElResultadoEnLaDivision(String number) {
        ValidateOperations.inTheCalculator(getResultDivision(),number);
    }

}
