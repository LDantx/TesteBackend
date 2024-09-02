package src;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String nome;
    private double saldo;
    private double taxaSistema;
    private List<Cliente> clientes;

    public void Empresa(String cnpj, String nome, double saldo, double taxaSistema) {
        if (!Validar.validarCNPJ(cnpj)) {
            throw new IllegalArgumentException("CNPJ inválido.");
        }
        this.cnpj = cnpj;
        this.nome = nome;
        this.saldo = 0.0;
        this.taxaSistema = taxaSistema;
        this.clientes = new ArrayList<>();
    }

    public <Cliente> void adicionarCliente(Cliente cliente) {
        clientes.add((src.Cliente) cliente);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaSistema() {
        return taxaSistema;
    }

    public void setTaxaSistema(double taxaSistema) {
        this.taxaSistema = taxaSistema;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void Transacao(Cliente cliente, double valor, boolean isDeposito) {
        if (isDeposito) {
            double taxa = valor * taxaSistema;
            double valorFinal = valor - taxa;
            cliente.depositar(valorFinal);
            this.saldo += taxa;
            System.out.println("Depósito processado com taxa de: " + taxa);
        } else {
            if (cliente.sacar(valor)) {
                this.saldo -= valor;
                System.out.println("Saque processado.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }

    }
}
