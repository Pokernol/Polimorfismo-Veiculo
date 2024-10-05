package br.com.fatecmogidascruzes.server;

import br.com.fatecmogidascruzes.model.entity.Carro;
import br.com.fatecmogidascruzes.model.entity.Moto;
import br.com.fatecmogidascruzes.model.entity.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final List<Veiculo> veiculos = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\nBem-vindo ao sistema de testes de Polimorfismo.");
        new Main().executar();
    }

    public void executar() {
        int opcao;

        do {
            System.out.println("\nPor favor escolha uma opção:");
            System.out.println("1° - Carro");
            System.out.println("2° - Moto");
            System.out.println("3° - Listar veículos cadastrados");
            System.out.println("4º - Realizar cálculo e reajuste de preços");
            System.out.println("5º - Sair");
            System.out.print("\nEscolha uma das opções: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCarro();
                    break;
                case 2:
                    cadastrarMoto();
                    break;
                case 3:
                    listarVeiculos();
                    break;
                case 4:
                    realizarCalculoEReajuste();
                    break;
                case 5:
                    System.out.println("\nSaindo do sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        } while (opcao != 5);
    }

    private void cadastrarCarro() {
        scanner.nextLine();

        System.out.print("\nPor favor digite o Modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Por favor digite o Preço do carro: ");
        double preco = scanner.nextDouble();

        System.out.print("Por favor digite a Quilometragem do carro: ");
        int km = scanner.nextInt();

        veiculos.add(new Carro(modelo, preco, km));

        System.out.println("\nCarro cadastrado com sucesso!");
    }

    private void cadastrarMoto() {
        scanner.nextLine();

        System.out.print("\nPor favor digite o Modelo da moto: ");
        String modelo = scanner.nextLine();

        System.out.print("Por favor digite o Preço da moto: ");
        double preco = scanner.nextDouble();

        System.out.print("Por favor digite o Ano da moto: ");
        int ano = scanner.nextInt();

        veiculos.add(new Moto(modelo, preco, ano));

        System.out.println("\nMoto cadastrada com sucesso!");
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("\nNenhum veículo cadastrado.");
        } else {
            System.out.println("\nVeículos cadastrados:");
            for (Veiculo veiculo : veiculos) {
                veiculo.printDados();
                System.out.println("-------------");
            }
        }
    }

    public void realizarCalculoEReajuste() {
        double totalPrecos = calcularTotalPrecos();
        System.out.println("\nTotal dos preços dos veículos antes dos reajustes: R$ " + totalPrecos);

        aplicarReajustes();

        double totalAposReajuste = calcularTotalPrecos();
        System.out.println("\nTotal dos preços dos veículos após os reajustes: R$ " + totalAposReajuste);
    }

    private double calcularTotalPrecos() {
        double total = 0;
        for (Veiculo veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }

    private void aplicarReajustes() {
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto moto) {
                if (moto.getAno() >= 2008) {
                    double precoReajustado = moto.getPreco() * 0.10;
                    moto.setPreco(precoReajustado);
                    System.out.println("Preço da moto " + moto.getModelo() + "  ajustado para: R$ " + precoReajustado);
                }
            } else if (veiculo instanceof Carro carro) {
                if (carro.getKm() > 100000) {
                    double precoReajustado = carro.getPreco() * 0.08;
                    carro.setPreco(precoReajustado);
                    System.out.println("Preço do carro " + carro.getModelo() + " ajustado para: R$ " + precoReajustado);
                }
            }
        }
    }
}
