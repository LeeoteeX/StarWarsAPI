package modelos;

import DTO.PeopleSWAPI;

public class People {
    private String name;
    private String birth_year;
    private String eye_color;
    private String gender;
    private String hair_color;
    private String height;
    private String mass;
    private String skin_color;
    private String homeworld;

    public People() {
    }

    public People(String name, String birth_year, String eye_color, String gender, String hair_color, String height, String mass, String skin_color, String homeworld) {
        this.name = name;
        this.birth_year = birth_year;
        this.eye_color = eye_color;
        this.gender = gender;
        this.hair_color = hair_color;
        this.height = height;
        this.mass = mass;
        this.skin_color = skin_color;
        this.homeworld = homeworld;
    }

    public People(PeopleSWAPI personaje) {
        this.name = personaje.name();
        this.birth_year = personaje.birth_year();
        this.eye_color = personaje.eye_color();
        this.gender = personaje.gender();
        this.hair_color = personaje.hair_color();
        this.height = personaje.height();
        this.mass = personaje.mass();
        this.skin_color = personaje.skin_color();
        this.homeworld = personaje.homeworld();
    }

    // Getters y setters

    @Override
    public String toString() {
        return  "nombre='" + name + '\'' +
                ", birth_year='" + birth_year + '\'' +
                ", eye_color='" + eye_color + '\'' +
                ", gender='" + gender + '\'' +
                ", hair_color='" + hair_color + '\'' +
                ", height='" + height + '\'' +
                ", mass='" + mass + '\'' +
                ", skin_color='" + skin_color + '\'' +
                ", homeworld='" + homeworld + '\'';
    }
}
