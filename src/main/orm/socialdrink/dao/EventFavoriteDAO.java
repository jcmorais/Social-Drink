/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package socialdrink.dao;

import org.orm.*;
import org.hibernate.LockMode;
import socialdrink.*;

public interface EventFavoriteDAO {
	public EventFavorite loadEventFavoriteByORMID(int ID) throws PersistentException;
	public EventFavorite getEventFavoriteByORMID(int ID) throws PersistentException;
	public EventFavorite loadEventFavoriteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventFavorite getEventFavoriteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventFavorite loadEventFavoriteByORMID(PersistentSession session, int ID) throws PersistentException;
	public EventFavorite getEventFavoriteByORMID(PersistentSession session, int ID) throws PersistentException;
	public EventFavorite loadEventFavoriteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventFavorite getEventFavoriteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventFavorite[] listEventFavoriteByQuery(String condition, String orderBy) throws PersistentException;
	public EventFavorite[] listEventFavoriteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEventFavorite(String condition, String orderBy) throws PersistentException;
	public java.util.List queryEventFavorite(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventFavoriteByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventFavoriteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventFavorite[] listEventFavoriteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public EventFavorite[] listEventFavoriteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEventFavorite(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryEventFavorite(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventFavoriteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventFavoriteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventFavorite loadEventFavoriteByQuery(String condition, String orderBy) throws PersistentException;
	public EventFavorite loadEventFavoriteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventFavorite loadEventFavoriteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public EventFavorite loadEventFavoriteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventFavorite createEventFavorite();
	public boolean save(socialdrink.EventFavorite eventFavorite) throws PersistentException;
	public boolean delete(socialdrink.EventFavorite eventFavorite) throws PersistentException;
	public boolean refresh(socialdrink.EventFavorite eventFavorite) throws PersistentException;
	public boolean evict(socialdrink.EventFavorite eventFavorite) throws PersistentException;
	public EventFavorite loadEventFavoriteByCriteria(EventFavoriteCriteria eventFavoriteCriteria);
	public EventFavorite[] listEventFavoriteByCriteria(EventFavoriteCriteria eventFavoriteCriteria);
}
