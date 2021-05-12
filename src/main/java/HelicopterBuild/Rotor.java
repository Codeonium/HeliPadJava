package HelicopterBuild;

public class Rotor {
    private String rotor;

    public Rotor(String rotor) {
        this.rotor = rotor;
    }

    public String getRotor() {
        return rotor;
    }

    public void setRotor(String rotor) {
        this.rotor = rotor;
    }
    public String makeSound() {
        return "suai suai suai fly fly";
    }
}
