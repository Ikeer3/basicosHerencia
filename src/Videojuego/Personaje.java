package Videojuego;

public class Personaje {

    protected String nombre;
    protected int ataque;

    public Personaje(String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public int atacar() {
        return ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }
}
