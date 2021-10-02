package Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.List;

import Business.ItemBusiness;
import Models.Item;

import java.io.*;

public class ItemController {

    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static ItemBusiness itemBusiness = new ItemBusiness();

    public static void listItems(int id) {
        System.out.println("-----------------------------------------------");
        List<Item> items = itemBusiness.listarItems();

        for (Item item : items) {
            if (id == 0) {
                printarProdutos(item);
            }
            else {
                if (item.getIdItem() == id) {
                    printarProdutos(item);
                }
            }
        }

    }

    public static void insertItem(String nmItem, BigDecimal valor, String dsItem, BigDecimal qtde, Integer idCategoria, boolean flEdit, int idItem) {
        var item = new Item();
        System.out.println("\n");

        if (item.isValid(nmItem, idCategoria, valor, dsItem, qtde)) {
            itemBusiness.insertItem(nmItem, idCategoria, valor, dsItem, qtde, flEdit, idItem);
            System.out.println("Registro salvo com sucesso");
        } else {
            System.out.println("Dados Invalidos");
        }
        System.out.println("\n");
    }

    public static void deleteItem (int idItem) {
        if (idItem > 0) {
            itemBusiness.deleteItem(idItem);
            System.out.println("Item excluido com sucesso");
        }
        else{
            System.out.println("ID Invalido");
        }
        System.out.println("\n");
    }

    public static void printarProdutos(Item item) {
        System.out.println("Item ID: " + item.getIdItem());
        System.out.println("Categoria ID: " + item.getIdCategoria());
        System.out.println("Item Nome: " + item.getNmItem());
        System.out.println("Item Valor Uni: " + item.getVlUnitario());
        System.out.println("Descricao Item: " + item.getDsItem());
        System.out.println("Quantidade Disponivel: " + item.getNrQtdeDisponivel());
        System.out.println("Nome Categoria: " + item.getCategoria().getNmRegistro());

        System.out.println("\n");

        System.out.println("-----------------------------------------------");

        System.out.println("\n");
    }

}
