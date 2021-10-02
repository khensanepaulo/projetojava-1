package Controller;

import Business.GenericaBusiness;
import Business.ItemBusiness;
import Models.Generica;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class GenericaController {

    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static GenericaBusiness generica = new GenericaBusiness();

    public static void listCategorias()
    {
        System.out.println("-----------------------------------------------");

        List<Generica> categorias = generica.listarCategoria();

        for(Generica categoria: categorias)
        {
            printarCategorias(categoria);
        }
    }

    public static void printarCategorias(Generica categoria)
    {
        System.out.println("ID Categoria: "+ categoria.getIdRegistro());
        System.out.println("Nome: " + categoria.getNmRegistro());
        System.out.println("Data do registro: " + categoria.getDtRegistro());
        System.out.println("-----------------------------------------------");

        System.out.println("\n");
    }

}
