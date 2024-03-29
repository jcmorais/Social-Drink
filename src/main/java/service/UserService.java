package service;

import socialdrink.*;

/**
 * Created by jpp on 30/06/16.
 */
public interface UserService {
    public User getUserById(int id);
    public Weekday[] orderHorary(Bar bar);

    void addFavoriteDrink(int drinkId, int userId);

    void removeFavoriteDrink(int drinkId, int userId);

    void followUser(int session, int userId);

    void unfollowUser(int session, int userId);

    Event[] getUserEvents();
}
