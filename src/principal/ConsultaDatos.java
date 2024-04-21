package principal;

import DTO.PlanetsSWAPI;
import com.google.gson.Gson;
import modelos.People;
import modelos.Planets;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDatos {

    public People buscarPersonajeID(int id) {

        String json;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.dev/api/people/" + id))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("No encontré ese personaje.");
        }
        json = response.body();
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        return gson.fromJson(json, People.class);
    }

    public String buscarPersonaje(String nombre) {
            String json;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://swapi.dev/api/people/?search=" + nombre.replace(" ","%20")))
                    .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("No encontré ese personaje");
        }
        json = response.body();
            nombre = json;
            return nombre;
    }

    public Planets buscarPlaneta(int id) {
        String json;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://swapi.dev/api/planets/" + id))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("No encontré ese planeta.");
        }
        json = response.body();
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        PlanetsSWAPI planeta = gson.fromJson(json, PlanetsSWAPI.class);
        return new Planets(planeta);
    }
}
