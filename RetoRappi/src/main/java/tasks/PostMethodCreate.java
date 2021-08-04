package tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;
import utils.Constants;
import utils.CreateBody;
import java.util.HashMap;
import java.util.Map;

public class PostMethodCreate implements Task {

    private String name;

    public PostMethodCreate(String name){
        this.name = name;
    }

    public static PostMethodCreate withTheUser(String name) {
        return Tasks.instrumented(PostMethodCreate.class,name);
    }

    @Step("{0} consume post method")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(Constants.RESOURCE_API_CREATE)
                        .with(  requestSpecification -> requestSpecification.headers(buildHeaders())
                                .body(
                                        CreateBody.withTheTemplate("src/test/resources/templates/create.json")
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