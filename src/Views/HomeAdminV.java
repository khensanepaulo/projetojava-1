package Views;

import Controller.ItemController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeAdminV {

    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    static ItemV homeItem = new ItemV();

    public static void menuAdmin() throws IOException {
        String option = "";

        do {
            System.out.println("A. CRUD Items");
            System.out.println("B. Sair");

            option = obj.readLine();
            System.out.println("\n");

            switch (option.toUpperCase()) {
                case "A":
                    homeItem.viewItems();
                    break;

                case "B":
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (!option.toUpperCase().equals("B"));

    }
}
