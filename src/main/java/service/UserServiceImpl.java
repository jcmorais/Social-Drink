package service;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import socialdrink.*;

/**
 * Created by jpp on 30/06/16.
 */
@Service("userPageService")
public class UserServiceImpl implements UserService{
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

    public Weekday[] getHorary(int userId){
        try {
            WeekdayCriteria criteria = new WeekdayCriteria();
            criteria.add(Restrictions.eq("id", userId));
            criteria.addOrder(Order.desc("day"));
            facade.listWeekdayByCriteria(criteria);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
