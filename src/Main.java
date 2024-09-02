package src;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa ("Empresa TGID", "12345678956478", 0.03);

        System.out.println((empresa1.getNome() + " CNPJ: " + empresa1.getCnpj() + " Taxa de sistema: " + empresa1.getTaxaSistema()));

        Cliente cliente1 = new Cliente("Laura", )
        System.out.println((cliente1.getNome() + " CPF: " + cliente1.getCpf() + " Contato: " + cliente1
                .getContato()));

        empresa1.adicionarCliente(cliente1);
        
        empresa1.Transacao(cliente1, 5000, true);
        empresa1.Transacao(cliente1, 2500, false);
    }
}