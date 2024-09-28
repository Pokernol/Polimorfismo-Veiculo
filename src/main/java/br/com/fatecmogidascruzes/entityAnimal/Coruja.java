package br.com.fatecmogidascruzes.entityAnimal;

public class Coruja extends Ave {
    @Override
    public String voar() {
        return "Voando";
    }

    @Override
    public String pouso() {
        return "Pousando";
    }

    @Override
    public String mover() {
        return "Se movendo com as patas";
    }
}
