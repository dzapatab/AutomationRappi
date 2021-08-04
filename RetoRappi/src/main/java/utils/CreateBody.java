package utils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateBody {
    private String plantillaRuta;

    public CreateBody(String plantillaRuta){
        this.plantillaRuta = plantillaRuta;
    }

    public static CreateBody withTheTemplate(String plantilla){
        return new CreateBody(plantilla);
    }

    public String andTheName(String name){
        String nuevaPlantilla = parseJson(plantillaRuta);
        nuevaPlantilla = nuevaPlantilla.replace("${name}", name);
        return nuevaPlantilla;
    }


    public String parseJson(String ruta){
        String resultStr="";
        try {
            resultStr=readFileAsString(ruta);
        } catch (Exception e) {
        }
        return resultStr;
    }

    public static String readFileAsString(String fileName)
    {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
        }
        return data;
    }

}

