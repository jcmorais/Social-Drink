package service;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import socialdrink.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpp on 04/07/16.
 */
@Service("searchService")
public class SearchServiceImpl implements SearchService {
    private Facade facade = new Facade();

    @Override
    public List<Consumer> searchConsumer(String name) {
        try {
            Consumer[] temp = facade.listConsumerByCriteria(new ConsumerCriteria());
            List<Consumer> aux = new ArrayList<>();

            for(int i=0; i<temp.length; i++) {
                if(temp[i].getFirstname().toLowerCase().contains(name.toLowerCase()) || temp[i].getLastname().toLowerCase().contains(name.toLowerCase())) {
                    aux.add(temp[i]);

                }
            }

            return aux;

        } catch (PersistentException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Bar> searchBar(String name) {
        try {
            Bar[] temp = facade.listBarByCriteria(new BarCriteria());
            List<Bar> aux = new ArrayList<>();

            for(int i=0; i<temp.length; i++) {
                if(temp[i].getName().toLowerCase().contains(name.toLowerCase())) {
                    aux.add(temp[i]);
                }
            }

            return aux;

        } catch (PersistentException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Drink> searchDrink(String name) {
        try {
            Drink[] temp = facade.listDrinkByCriteria(new DrinkCriteria());
            List<Drink> aux = new ArrayList<>();

            for(int i=0; i<temp.length; i++) {
                if(temp[i].getName().toLowerCase().contains(name.toLowerCase())) {
                    aux.add(temp[i]);
                }
            }

            return aux;

        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }
}
