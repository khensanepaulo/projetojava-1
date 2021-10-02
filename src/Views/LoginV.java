package Views;

import Controller.LoginController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class LoginV {

    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static LoginController loginController = new LoginController();

    public static void main(String[] args) throws IOException {
        String option = "";

        do {
            System.out.println("A. Logar como admin");
            System.out.println("B. Logar como usuario");
            System.out.println("C. Sair");

            option = obj.readLine();
            System.out.println("\n");

            switch (option.toUpperCase()) {

                case "A":
                    logIn("admin");
                    break;

                case "B":
                    logIn("cliente");
                    break;

                case "C":
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (!option.toUpperCase().equals("C"));
    }

    public static void logIn(String tpLogin) throws IOException {
        String usuario = "";
        String senha = "";

        System.out.println("Digite seu usuario");
        usuario = obj.readLine();
        System.out.println("Digite sua senha");
        senha = obj.readLine();

        if (usuario != "" && senha != "") {
            loginController.logIn(tpLogin, usuario, senha);
        }
    }

}
