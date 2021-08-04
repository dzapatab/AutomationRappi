package tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;
import utils.Constants;
import utils.CreateBody;
import java.util.HashMap;
import java.util.Map;

public class PutMethod implements Task {
    private String name;
    private int idUser;

    public PutMethod(String name, int idUser){
        this.name = name;
        this.idUser = idUser;
    }

    public static PutMethod withTheUser(String name,int idUser) {
        return Tasks.instrumented(PutMethod.class,name, idUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to(Constants.RESOURCE_API_USERS+idUser)
                        .with(requestSpecification -> requestSpecification.headers(buildHeaders())
                                .body( CreateBody.withTheTemplate("src/test/resources/templates/putuser.json")
                                        .andTheName(name)
                                ).relaxedHTTPSValidation().log().all()));
        SerenityRest.lastResponse().body().prettyPrint();
    }
    private Map<String, Object> buildHeaders() {
        Map<String, Object> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }
}
