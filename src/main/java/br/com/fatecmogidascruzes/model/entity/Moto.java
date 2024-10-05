package br.com.fatecmogidascruzes.model.entity;

public class Moto extends Veiculo{
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void printDados(){
        System.out.println("Tipo de Veiculo: " + getClass().getSimpleName());
        super.printDados();
        System.out.println("Ano: " + ano);
    }

}
