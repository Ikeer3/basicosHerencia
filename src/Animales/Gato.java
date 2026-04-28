package Animales;

public class Gato extends Animal {

    private String color;

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public String hacerSonido() {
        return getNombre() + " de color " + color + " hace MIAU!!";
    }
}
