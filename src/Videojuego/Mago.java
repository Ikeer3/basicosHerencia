package Videojuego;

import java.util.Random;

public class Mago extends  Personaje {

    public Mago(String nombre, int ataque) {
        super(nombre, ataque);
    }

    Random random = new Random();

    @Override
    public int atacar() {
        return random.nextInt(80, 121);
    }
}
