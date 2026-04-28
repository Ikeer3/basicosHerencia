package Videojuego;

public class Guerrero extends Personaje{

    public Guerrero(String nombre, int ataque) {
        super(nombre, ataque);
    }

    @Override
    public int atacar() {
        int resultado = atacar();
        if (Math.random() < 0.1) {
            resultado = atacar() * 2;
        }
        return resultado;
    }
}
