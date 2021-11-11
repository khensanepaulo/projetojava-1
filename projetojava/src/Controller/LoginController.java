package Controller;

import Business.LogInBusiness;
import Models.Usuario;
import Views.HomeAdminV;
import Views.ItemV;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class LoginController {

    static LogInBusiness logInBusiness = new LogInBusiness();

    public static void logIn (String tpLogin, String usuario, String senha)
    {

        try {
            Usuario usu = logInBusiness.login(tpLogin, usuario, senha);

            if (usu.getUsuario() != null)
            {
                System.out.println("\n");
                System.out.println("Olá " + usu.getUsuario().toUpperCase() + " vc esta logado como: " + usu.getAcesso().toUpperCase());
                System.out.println("\n");

                if (tpLogin == "admin") {
                    HomeAdminV.menuAdmin();
                }
                else if (tpLogin == "cliente") {

                }
            }
            else {
                System.out.println("\n");
                System.out.println("Usuario ou senha invalidos");
                System.out.println("\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
