package br.com.fatecmogidascruzes.server;

import br.com.fatecmogidascruzes.entityAnimal.Ave;
import br.com.fatecmogidascruzes.entityAnimal.Cachorro;
import br.com.fatecmogidascruzes.entityAnimal.Coruja;
import br.com.fatecmogidascruzes.entityAnimal.Mamifero;
import br.com.fatecmogidascruzes.entityCliente.PessoaFisica;
import br.com.fatecmogidascruzes.entityCliente.PessoaJuridica;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de testes de classes abstratas");
        System.out.println("1° - Testar animais");
        System.out.println("2° - Testar clientes");
        System.out.print("Escolha uma das opção:");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                testarAnimais();
                break;
            case 2:
                testarClientes();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void testarAnimais() {
        Mamifero cachorro = new Cachorro();
        System.out.println("\nCachorro:");
        System.out.println(cachorro.mover());
        System.out.println(cachorro.parir());
        System.out.println(cachorro.mamar());
        System.out.println(cachorro.respirar());

        Ave coruja = new Coruja();
        System.out.println("\nCoruja:");
        System.out.println(coruja.mover());
        System.out.println(coruja.voar());
        System.out.println(coruja.pouso());
        System.out.println(coruja.respirar());
    }

    private static void testarClientes() {

        System.out.println("\nCriando um cliente pessoa física...");

        PessoaFisica clientePessoaFisica = new PessoaFisica();
        clientePessoaFisica.setNome("João da Silva");
        clientePessoaFisica.setCpf("123.456.789-10");
        clientePessoaFisica.setEstadoCivil("Solteiro");
        clientePessoaFisica.setDataAberturaConta(LocalDate.now());
        clientePessoaFisica.setAgencia(1234);
        clientePessoaFisica.setConta(123456);
        clientePessoaFisica.setSaldo(1000.0);
        System.out.println("\nInformações do cliente pessoa física:");
        clientePessoaFisica.exibirInformacoes();

        System.out.println("\nCriando um cliente pessoa jurídica...");

        PessoaJuridica clientePessoaJuridica = new PessoaJuridica();
        clientePessoaJuridica.setCnpj("12.345.678/0001-99");
        clientePessoaJuridica.setResponsavel("Empresa Ltda");
        clientePessoaJuridica.setPorteEmpresa("Pequena");
        clientePessoaJuridica.setDataAberturaConta(LocalDate.now());
        clientePessoaJuridica.setAgencia(5678);
        clientePessoaJuridica.setConta(987654);
        clientePessoaJuridica.setSaldo(2000.0);
        System.out.println("\nInformações do cliente pessoa jurídica:");
        clientePessoaJuridica.exibirInformacoes();
    }
}
