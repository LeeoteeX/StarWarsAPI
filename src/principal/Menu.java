package principal;

import modelos.People;
import modelos.Planets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu() throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        List<People> listaPersonajes = new ArrayList<>();
        List<Planets> listaPlanetas = new ArrayList<>();
        int opcPrincipal = 0;
        ConsultaDatos consultaDatos = new ConsultaDatos();
        GuardarArchivos guardarArchivos = new GuardarArchivos();

        while(true){
            System.out.println("""
                Bienvenido a StarWars API!
                ¿Que desea buscar?
                
                1 - Personajes
                
                2 - Planetas
                
                0 - Salir
                """);
            opcPrincipal = teclado.nextInt();
            if(opcPrincipal == 0) break;
            while(true){
                int opcPersonaje;
                switch (opcPrincipal){
                    case 1:
                        teclado.nextLine();
                        int id;
                        System.out.println("""
                                Ingrese el ID del personaje a buscar:
                                """);
                        id = teclado.nextInt();
                        People personajeJava = consultaDatos.buscarPersonajeID(id);
                        listaPersonajes.add(personajeJava);
                        System.out.println("Personaje agregado: " + personajeJava);
                        System.out.println("""
                                Quiere buscar otro personaje?
                                
                                1 - SI
                                2 - Atrás
                                """);
                        opcPersonaje = teclado.nextInt();
                        if (opcPersonaje == 1) {
                            continue;
                        } else if (opcPersonaje == 2) {
                            break;
                        } else {
                            System.out.println("Ingrese una opción válida.");
                            continue;
                        }
                    case 2:
                        teclado.nextLine();
                        int opcPlaneta;
                        System.out.println("""
                                Ingrese el ID del planeta a buscar:
                                """);
                        id = teclado.nextInt();
                        Planets planetaJava = consultaDatos.buscarPlaneta(id);
                        listaPlanetas.add(planetaJava);
                        System.out.println("Planeta agregado!: " + planetaJava);
                        System.out.println("""
                                Desea buscar otro planeta?
                                
                                1 - SI
                                2 - Atrás
                                """);
                        opcPlaneta = teclado.nextInt();
                        if (opcPlaneta == 1){
                            continue;
                        } else if (opcPlaneta == 2) {
                            break;
                        } else System.out.println("Ingrese una opción válida.");
                        continue;
                }
                break;
            }
        }
        guardarArchivos.guardarPersonaje(listaPersonajes);
        guardarArchivos.guardarPlanetas(listaPlanetas);
    }
}
