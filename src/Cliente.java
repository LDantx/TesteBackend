package src;

import src.Validar;

public class Cliente {
    private String cpf;
    private String nome;
    private double saldo;
    private String contato;


    public void CLiente(String cpf, String nome, String contato, double saldo){
        if (!Validar.validarCPF(cpf)){
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = 0.0;
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }


    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
