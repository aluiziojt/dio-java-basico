package edu.aluizio.primeirasemana;
import javax.swing.text.StringContent;

public class MinhaClasse {
    public static void main(String[] args) {

        System.out.print("OLÁ TURMA");
        String primeironome = "Aluizio";
        String sobrenome = "Torres";
        int anoFabricacao = 2022;
        boolean verdadeira = true;

        System.out.println(nomeCompleto(primeironome, sobrenome));
    }

    public static String nomeCompleto(String primeiroNome, String sobrenome) {
        return primeiroNome + " " + sobrenome;
    }
}
