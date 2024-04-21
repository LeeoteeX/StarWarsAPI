package principal;


import com.google.gson.Gson;
import modelos.People;
import modelos.Planets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GuardarArchivos {

    public void guardarPersonaje(List<People> personajes) {
        try {
            if (!personajes.isEmpty()) {
                File archivo = new File("personajes.json");
                Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
                FileWriter escribir = new FileWriter(archivo);
                escribir.write(gson.toJson(personajes));
                escribir.close();
                System.out.println("Se generó el personajes.json dentro de su dispositivo.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void guardarPlanetas(List<Planets> listaPlanetas) throws IOException {
        if (!listaPlanetas.isEmpty()){
            File archivo = new File("planetas.json");
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            FileWriter escribir = new FileWriter(archivo);
            escribir.write(gson.toJson(listaPlanetas));
            escribir.close();
            System.out.println("Se creó un archivo planetas.json dentro de su dispositivo.");
        }
    }
}
