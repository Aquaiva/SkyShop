package org.skypro.skyshop.search_engine;
import org.skypro.skyshop.searchable.Searchable;
import java.util.ArrayList;
import java.util.List;
public class SearchEngine {
    private Searchable[] items;
    private int count;

    public SearchEngine(int size) {
        items = new Searchable[size];
        count = 0;
    }

    public void add(Searchable item) {
        if (count < items.length) {
            items[count++] = item;
        } else {
            System.out.println("Массив заполнен, не удалось добавить элемент.");
        }
    }

    public Searchable[] search(String searchTerm) {
        List<Searchable> results = new ArrayList<>();

        for (Searchable item : items) {
            if (item != null && item.getSearchTerm().toLowerCase().contains(searchTerm.toLowerCase())) {
                results.add(item);
                if (results.size() == 5) {
                    break;
                }
            }
        }

        return results.toArray(new Searchable[0]);
    }
}
