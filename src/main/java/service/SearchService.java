package service;

import socialdrink.Bar;
import socialdrink.Consumer;
import socialdrink.Drink;

import java.util.List;


/**
 * Created by jpp on 04/07/16.
 */
public interface SearchService {
    public List<Consumer> searchConsumer(String name);
    public List<Bar> searchBar(String name);
    public List<Drink> searchDrink(String name);
}
