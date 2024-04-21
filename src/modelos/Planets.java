package modelos;

import DTO.PlanetsSWAPI;

public class Planets {
    private String nombre;
    private int diametro; //km
    private int periodoRotacion; //horas
    private int periodoOrbital; //dias
    private double gravedad;
    private String poblacion;
    private String terreno;
    private String clima;

    public Planets() {
    }

    public Planets(String clima, String terreno, int poblacion, double gravedad, int periodoOrbital, int periodoRotacion, int diametro, String nombre) {
        this.clima = clima;
        this.terreno = terreno;
        this.poblacion = String.valueOf(Integer.valueOf(poblacion));
        this.gravedad = gravedad;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
        this.diametro = diametro;
        this.nombre = nombre;
    }

    public Planets(PlanetsSWAPI planeta) {
        //SOLUCIONAR CUANDO ES NULO
        this.clima = planeta.climate();
        this.terreno = planeta.terrain();
        this.poblacion = planeta.population();
        this.gravedad = Integer.valueOf(planeta.gravity().substring(0,1));
        this.periodoOrbital = Integer.valueOf(planeta.orbital_period());
        this.periodoRotacion = Integer.valueOf(planeta.rotation_period());
        this.diametro = Integer.valueOf(planeta.diameter());
        this.nombre = planeta.name();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(int periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public int getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(int periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public int getPoblacion() {
        return Integer.valueOf(poblacion);
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = String.valueOf(Integer.valueOf(poblacion));
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    @Override
    public String toString() {
        return "planets{" +
                "nombre='" + nombre + '\'' +
                ", diametro=" + diametro +
                ", periodoRotacion=" + periodoRotacion +
                ", periodoOrbital=" + periodoOrbital +
                ", gravedad=" + gravedad +
                ", poblacion=" + poblacion +
                ", terreno='" + terreno + '\'' +
                ", clima='" + clima + '\'' +
                '}';
    }
}
