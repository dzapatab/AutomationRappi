package stepdefinitions;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import org.hamcrest.Matchers;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import exceptions.Exceptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.GivenWhenThen;

import questions.LastResponseStatusCode;
import questions.ResponseService;
import tasks.GetMethodUsers;
import tasks.PostMethodCreate;
import tasks.PutMethod;
import utils.Constants;
import utils.Messages;

public class CallServiceRegisterStepDefinitions {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se conecta a la  API$")
    public void queElUsuarioSeConectaALaAPI() {
        theActorCalled("actor").whoCan(CallAnApi.at(Constants.API));
    }

    @Cuando("^consume el metodo get$")
    public void consumeElMetodoGet() {
        theActorInTheSpotlight().attemptsTo(
                GetMethodUsers.validateData(2)
        );
    }


    @Entonces("^deberia ver el codigo de respuesta (\\d+)$")
    public void deberiaVerElCodigoDeRespuesta(int code) {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(code))
                .orComplainWith(Exceptions.class, Messages.ERROR_CODE.getMessage()));
    }

    @Entonces("^verifica que exista el id \"([^\"]*)\"$")
    public void verificaQueExistaElId(String id) {
        theActorInTheSpotlight().should(GivenWhenThen
                .seeThat(ResponseService.extractData("data.id"),Matchers.containsString(id)));
    }


    //POST

    @Cuando("^consume el metodo post con el nombre \"([^\"]*)\"$")
    public void consumeElMetodoPostConElNombre(String name) {
        theActorInTheSpotlight().attemptsTo(
                PostMethodCreate.withTheUser(name)
        );
    }

    @Entonces("^verifica que exista el nombre \"([^\"]*)\"$")
    public void verificaQueExistaElNombre(String name) {
        theActorInTheSpotlight().should(GivenWhenThen
                .seeThat(ResponseService.extractData("name"),Matchers.equalTo(name)));
    }
//PUT
    @Cuando("^consume el metodo put con el nombre \"([^\"]*)\"$")
    public void consumeElMetodoPutConElNombre(String name) {
        theActorInTheSpotlight().attemptsTo(
                PutMethod.withTheUser(name,2)
        );


    }

    @Entonces("^verifica que se haya cambiado el nombre a \"([^\"]*)\"$")
    public void verificaQueSeHayaCambiadoElNombreA(String name) {
        theActorInTheSpotlight().should(GivenWhenThen
                .seeThat(ResponseService.extractData("name"),Matchers.equalTo(name)));
    }




}