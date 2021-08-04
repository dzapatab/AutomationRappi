package questions;


import net.serenitybdd.screenplay.Question;

public class ResponseService {
    private ResponseService() {
    }

    public static Question<String> extractData(String campo) {
        return new ValueDataService(campo);
    }
}