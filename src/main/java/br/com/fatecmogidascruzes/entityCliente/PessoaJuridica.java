package br.com.fatecmogidascruzes.entityCliente;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String responsavel;
    private String porteEmpresa;
    private LocalDate dataAberturaConta;

    public PessoaJuridica() {
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getPorteEmpresa() {
        return porteEmpresa;
    }

    public void setPorteEmpresa(String porteEmpresa) {
        this.porteEmpresa = porteEmpresa;
    }

    public LocalDate getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(LocalDate dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    public void exibirInformacoes() {
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Tipo da Conta: " + getClass().getSimpleName());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getConta());
    }
}
