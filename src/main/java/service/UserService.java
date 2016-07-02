package service;

import socialdrink.Bar;
import socialdrink.User;
import socialdrink.Weekday;

/**
 * Created by jpp on 30/06/16.
 */
public interface UserService {
    public User getUserById(int id);
    public Weekday[] orderHorary(Bar bar);
}
