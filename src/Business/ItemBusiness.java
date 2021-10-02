package Business;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.FileWriter;
import java.lang.reflect.Type;

import Models.Generica;
import com.google.gson.reflect.TypeToken;
import Models.Item;
import com.google.gson.Gson;
import utils.utils;

import java.util.Arrays;
import java.util.List;

public class ItemBusiness {

    static String pathJson = "C:/Users/khensane Paulo/Desktop/School/Segundo Periodo/Segundo mes/projetojava (1)/projetojava/src/DB/items.json";
    static utils util = new utils();
    GenericaBusiness genericaBusiness = new GenericaBusiness();
    Gson gson = new Gson();

    public List<Item> listarItems() {
        List<Item> items = new ArrayList<Item>();
        try {
            String json = String.join(" ", Files.readAllLines(Paths.get(pathJson), StandardCharsets.UTF_8));
            Type listType = new TypeToken<ArrayList<Item>>() {
            }.getType();
            items = new Gson().fromJson(json, listType);

        } catch (Exception e) {
        }
        finally {
            return items;
        }
    }

    public void insertItem(String nmItem, Integer idCategoria, BigDecimal valor, String dsItem, BigDecimal qtde, boolean flEdit, int idItem) {
        try {
            Item item = new Item();
            Generica categoria = genericaBusiness.getById(idCategoria);
            List<Item> items = listarItems();

            if (!flEdit) {
                Item lastItem = utils.getLast(items);
                int idNewItem = lastItem.getIdItem() + 1;

                Item novoItem = item.MontarItem(idNewItem, nmItem, idCategoria, valor, dsItem, qtde, categoria);
                items.add(novoItem);
            } else {
                Item editItem = item.MontarItem(idItem, nmItem, idCategoria, valor, dsItem, qtde, categoria);
                int index = 0;
                int i = 0;
                for (Item it : items) {
                    if (it.getIdItem() == idItem) {
                        index = i;
                        break;
                    }
                    i++;
                }
                if (index > 0) {
                    items.remove(index);
                    items.add(index, editItem);
                }
            }
            String itemSerialize = gson.toJson(items);
            util.writeJson(pathJson, itemSerialize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteItem(int idItem) {
        try {
            List<Item> items = listarItems();

            int index = 0;
            int i = 0;
            for (Item it : items) {
                if (it.getIdItem() == idItem) {
                    index = i;
                    break;
                }
                i++;
            }
            if (index > 0) {
                items.remove(index);
            }

            String itemSerialize = gson.toJson(items);
            util.writeJson(pathJson, itemSerialize);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}