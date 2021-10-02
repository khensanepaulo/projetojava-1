package Views;

import Controller.GenericaController;
import Controller.ItemController;
import utils.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class ItemV {
    static utils util = new utils();
    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static ItemController itemController = new ItemController();
    static GenericaController genericaController = new GenericaController();

    public static void viewItems() throws IOException {
        {
            String option = "";

            do {
                System.out.println("A. Listar Items");
                System.out.println("B. Cadastrar Item");
                System.out.println("C. Editar Item");
                System.out.println("D. Excluir Item");
                System.out.println("E. Sair");

                option = obj.readLine();
                System.out.println("\n");

                switch (option.toUpperCase()) {
                    case "A":
                        itemController.listItems(0);
                        break;

                    case "B":
                        cadastrarItem(false, 0);
                        break;

                    case "C":
                        editItem();
                        break;

                    case "D":
                       deleteItem();
                        break;

                    case "E":
                        break;

                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            } while (!option.toUpperCase().equals("E"));
        }
    }

    public static void cadastrarItem(boolean flEdit, int idItem) throws IOException {
        System.out.println("Nome do item");
        String nmItem = obj.readLine();
        System.out.println("\n");

        System.out.println("Valor Unitario");
        BigDecimal valor = util.toDecimal(obj.readLine());
        System.out.println("\n");

        System.out.println("Descrição do Item");
        String dsItem = obj.readLine();
        System.out.println("\n");

        System.out.println("Quantidade Disponivel");
        BigDecimal qtde = util.toDecimal(obj.readLine());
        System.out.println("\n");

        System.out.println("Categorias Disponiveis");
        genericaController.listCategorias();
        System.out.println("Digite o ID da Categoria:");
        Integer idCategoria = util.toInteger(obj.readLine());

        itemController.insertItem(nmItem, valor, dsItem, qtde, idCategoria, flEdit, idItem);

    }


    public static void editItem() throws IOException {
        System.out.println("Items Disponiveis: ");
        itemController.listItems(0);
        System.out.println("Digite o ID do Item que deseja editar:");
        int idItem = Integer.parseInt(obj.readLine());
        System.out.println("\n");
        itemController.listItems(idItem);

        cadastrarItem(true, idItem);
    }

    public static void deleteItem() throws IOException {
        System.out.println("Items Disponiveis: ");
        itemController.listItems(0);
        System.out.println("Digite o ID do Item que deseja excluir:");
        int idItem = Integer.parseInt(obj.readLine());
        System.out.println("\n");
        itemController.deleteItem(idItem);

    }

}
