package br.com.fatecmogidascruzes.entityAnimal;

public class Cachorro extends Mamifero {

    @Override
    public String mover() {
        return "Se movendo com as patas";
    }

    @Override
    public String parir() {
        return "Parindo";
    }

    @Override
    public String mamar() {
        return "Mamando";
    }
}
