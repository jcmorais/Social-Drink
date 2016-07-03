package service;

import socialdrink.Bar;
import socialdrink.Event;
import socialdrink.User;
import socialdrink.Weekday;

/**
 * Created by jpp on 30/06/16.
 */
public interface UserService {
    public User getUserById(int id);
    public Weekday[] orderHorary(Bar bar);

    void addFavoriteDrink(int drinkId);

    void removeFavoriteDrink(int drinkId);

    void followUser(int userId);

    void unfollowUser(int userId);

    Event[] getUserEvents();
}
