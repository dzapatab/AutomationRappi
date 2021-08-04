package tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpHeaders;
import utils.Constants;

public class GetMethodUsers implements Task {
    private int page;

    public GetMethodUsers(int page) {
        this.page = page;
    }

    public static GetMethodUsers validateData(int page) {
        return Tasks.instrumented(GetMethodUsers.class, page);
    }

    @Step("{0} consume get method")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(Constants.RESOURCE_API_USERS + page).with(
                        request -> request.headers(HttpHeaders.CONTENT_TYPE, ContentType.JSON).log().all())
        );
        SerenityRest.lastResponse().body().prettyPrint();
    }
}
