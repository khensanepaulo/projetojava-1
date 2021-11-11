package Business;

import Models.Item;
import Models.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LogInBusiness {

    static String pathUsuarios = "C:/Users/khensane Paulo/Desktop/School/Segundo Periodo/Segundo mes/projetojava (1)/projetojava/src/DB/usuarios.json";
    public Usuario login (String tpLogin, String usuario, String senha)
    {
        Usuario usuLogado = new Usuario();
        try {
            String json = String.join(" ", Files.readAllLines(Paths.get(pathUsuarios), StandardCharsets.UTF_8));

            Type listType = new TypeToken<ArrayList<Usuario>>(){}.getType();

            ArrayList<Usuario> usuarios = new Gson().fromJson(json, listType);


            for (Usuario usu : usuarios) {
                if (usu.getAcesso().equals(tpLogin) && usu.getSenha().equals(senha) && usu.getUsuario().equals(usuario)) {
                    usuLogado = usu;
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            return usuLogado;
        }
    }

}
