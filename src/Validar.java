package src;

public class Validar {
    public static boolean validarCPF(String cpf){
        cpf = cpf.replaceAll("\\D", "");
        if (cpf.length() !=11) return false;

        return cpf.matches("\\d{11}");
    }

    public static boolean validarCNPJ(String cnpj){
        cnpj = cnpj.replaceAll("\\D", "");
        if (cnpj.length() !=14) return false;

        return cnpj.matches("\\d{14}");
    }
}
