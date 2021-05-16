package LacosDeRepeticao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while(exibirTelaLogin){
            System.out.println("Digite seu login");
            String logindDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if(login.equals(logindDigitado) && password.equals(passwordDigitado)){
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
            }else{
                System.out.println("ACESSO NEGADO");
            }
        }
    }
}
