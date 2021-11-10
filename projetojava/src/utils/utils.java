package utils;

import Models.Item;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class utils {


    public void writeJson (String path, String itemSerialize) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(itemSerialize);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BigDecimal toDecimal(String str){
        var decimal = new BigDecimal(str);
        return decimal;
    }

    public static Integer toInteger(String str) {
        Integer number = Integer.valueOf(str);
        return number;
    }

    public static <T> T getFirst(Iterable<T> iterable) {
        return getFirstOrDefault(iterable, null);
    }

    public static <T> T getFirstOrDefault(Iterable<T> iterable, T defaultValue) {
        if (iterable == null) {
            return defaultValue;
        }
        Iterator<T> iterator = iterable.iterator();
        return iterator.hasNext() ? iterator.next() : defaultValue;
    }

    public static <T> T getLast(Iterable<T> iterable) {
        return getLastOrDefault(iterable, null);
    }

    public static <T> T getLastOrDefault(Iterable<T> iterable, T defaultValue) {
        if (iterable == null) {
            return defaultValue;
        }
        if (iterable instanceof Collection) {
            Collection<T> collection = (Collection<T>) iterable;
            if (collection.isEmpty()) {
                return defaultValue;
            } else if (collection instanceof List) {
                List<T> list = (List<T>) collection;
                return list.get(list.size() - 1);
            }
        }
        Iterator<T> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            T value;
            do {
                value = iterator.next();
            } while (iterator.hasNext());
            return value;
        }
        return defaultValue;
    }

}
