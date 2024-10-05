package br.com.fatecmogidascruzes.model.entity;

public class Carro extends Veiculo {

    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public void printDados(){
        System.out.println("Tipo de Veiculo: " + getClass().getSimpleName());
        super.printDados();
        System.out.println("Km rodados: " + km);
    }
}
