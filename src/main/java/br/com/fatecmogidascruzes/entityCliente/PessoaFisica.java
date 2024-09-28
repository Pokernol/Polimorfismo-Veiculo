package br.com.fatecmogidascruzes.entityCliente;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {

    private String cpf;
    private String dataNascimento;
    private String estadoCivil;
    private LocalDate dataAberturaConta;

    public PessoaFisica() {
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(LocalDate dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Tipo da Conta: " + getClass().getSimpleName());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getConta());
    }

}

