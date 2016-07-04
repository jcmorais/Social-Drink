package service;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import socialdrink.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jpp on 30/06/16.
 */
@Service("userPageService")
public class UserServiceImpl implements UserService {
    private Facade facade = new Facade();

    @Override
    public User getUserById(int id) {
        User user = null;

        try {
            user = facade.getUserByORMID(id);

        } catch (PersistentException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public Weekday[] orderHorary(Bar bar) {
        Weekday[] temp = new Weekday[7];

        for(Weekday aux : bar.horary.toArray()) {
            temp[aux.getDay()] = aux;
        }

        return temp;
    }


    @Override
    public void addFavoriteDrink(int drinkId, int userId) {
        try {
            Consumer consumer = facade.getConsumerByORMID(userId);
            consumer.favoriteDrinks.add(facade.getDrinkByORMID(drinkId));

            //Event
            EventFavorite event = facade.createEventFavorite();
            event.setDrink(facade.getDrinkByORMID(drinkId));
            consumer.events.add(event);

            facade.save(consumer);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeFavoriteDrink(int drinkId, int userId) {
        try {
            Consumer consumer = facade.getConsumerByORMID(userId);
            Iterator<Drink> it = consumer.favoriteDrinks.getIterator();
            boolean flag = true;
            while (it.hasNext() && flag){
                Drink drink = it.next();
                if (drinkId == drink.getID()){
                    flag = false;
                    it.remove();
                }
            }
            facade.save(consumer);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Consumer followUser(int session, int userId) {
        try {
            Consumer consumer = facade.getConsumerByORMID(session);
            consumer.follow.add(facade.getConsumerByORMID(userId));
            facade.save(consumer);
            return consumer;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Consumer unfollowUser(int session, int userId) {
        try {
            Consumer consumer = facade.getConsumerByORMID(session);
            Iterator<User> it = consumer.follow.getIterator();
            boolean flag = true;
            while (it.hasNext() && flag){
                User user = it.next();

                if (userId == user.getID()){
                    flag = false;
                    it.remove();
                }
            }
            facade.save(consumer);
            return consumer;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Event[] getUserEvents() {
        Consumer consumer = null;
        try {
            consumer = facade.getConsumerByORMID(1);
            return consumer.events.toArray();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }


}
