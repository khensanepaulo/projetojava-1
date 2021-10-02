package Business;

import Models.Generica;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GenericaBusiness {

    static String pathGenerica = "C:/Users/khensane Paulo/Desktop/School/Segundo Periodo/Segundo mes/projetojava (1)/projetojava/src/DB/generica.json";
    public ArrayList<Generica> listarCategoria()
    {
        ArrayList<Generica> categorias = new ArrayList<Generica>();
        try
        {
            String json = String.join(" ", Files.readAllLines(Paths.get(pathGenerica), StandardCharsets.UTF_8));

            Type listType = new TypeToken<ArrayList<Generica>>(){}.getType();

            ArrayList<Generica> genericas = new Gson().fromJson(json, listType);


            for (Generica registro : genericas) {
                if (registro.getTpRegistro().equals("CATEG") && registro.getFlExcluido().equals(false)){
                    categorias.add(registro);
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            return categorias;
        }
    }

    public Generica getById (int id) {

        try {

            ArrayList<Generica> genericas = listarCategoria();
            Generica reg = new Generica();

            for (Generica generica : genericas) {
                if (generica.getIdRegistro() == id){
                    reg = generica;
                }
            }

            return reg;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
