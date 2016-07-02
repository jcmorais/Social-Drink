package service;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import socialdrink.*;

import java.util.ArrayList;
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


}
