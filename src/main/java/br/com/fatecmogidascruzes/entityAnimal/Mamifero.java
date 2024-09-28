package br.com.fatecmogidascruzes.entityAnimal;

public abstract class Mamifero extends Animal {

    public abstract String mamar();
    public abstract String parir();

    @Override
    public String mover(){
        return "Andando";
    };

}
