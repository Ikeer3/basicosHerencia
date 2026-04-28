package Animales;

public class Gato extends Animal {

    private String raza;

    public Gato(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public String hacerSonido() {
        return getNombre() + " de raza " + raza + " hace MIAU!!";
    }
}
