package service;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import socialdrink.Facade;
import socialdrink.User;
import socialdrink.UserCriteria;

/**
 * Created by jpp on 03/07/16.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService{
    Facade facade = new Facade();

    @Override
    public User login(String email, String password) {
        User user = null;

        try {
            UserCriteria criteria = new UserCriteria();
            criteria.add(Restrictions.eq("email", email));
            criteria.add(Restrictions.eq("password", password));
            criteria.addOrder(Order.asc("id"));

            User[] users = facade.listUserByCriteria(criteria);

            if(users.length > 0) {
                user = users[0];
            }

        } catch (PersistentException e) {
            e.printStackTrace();
        }

        return user;
    }
}
