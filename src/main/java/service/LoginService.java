package service;

import socialdrink.User;

/**
 * Created by jpp on 03/07/16.
 */
public interface LoginService {
    public User login(String email, String password);
}
