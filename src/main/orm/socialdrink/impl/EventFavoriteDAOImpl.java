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
package socialdrink.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import socialdrink.*;

public class EventFavoriteDAOImpl implements socialdrink.dao.EventFavoriteDAO {
	public EventFavorite loadEventFavoriteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventFavoriteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite getEventFavoriteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getEventFavoriteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite loadEventFavoriteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventFavoriteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite getEventFavoriteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getEventFavoriteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite loadEventFavoriteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventFavorite) session.load(socialdrink.EventFavorite.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite getEventFavoriteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventFavorite) session.get(socialdrink.EventFavorite.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite loadEventFavoriteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventFavorite) session.load(socialdrink.EventFavorite.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite getEventFavoriteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventFavorite) session.get(socialdrink.EventFavorite.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventFavorite(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryEventFavorite(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventFavorite(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryEventFavorite(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite[] listEventFavoriteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listEventFavoriteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite[] listEventFavoriteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listEventFavoriteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventFavorite(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventFavorite as EventFavorite");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventFavorite(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventFavorite as EventFavorite");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventFavorite", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite[] listEventFavoriteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEventFavorite(session, condition, orderBy);
			return (EventFavorite[]) list.toArray(new EventFavorite[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite[] listEventFavoriteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEventFavorite(session, condition, orderBy, lockMode);
			return (EventFavorite[]) list.toArray(new EventFavorite[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite loadEventFavoriteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventFavoriteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite loadEventFavoriteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventFavoriteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite loadEventFavoriteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EventFavorite[] eventFavorites = listEventFavoriteByQuery(session, condition, orderBy);
		if (eventFavorites != null && eventFavorites.length > 0)
			return eventFavorites[0];
		else
			return null;
	}
	
	public EventFavorite loadEventFavoriteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EventFavorite[] eventFavorites = listEventFavoriteByQuery(session, condition, orderBy, lockMode);
		if (eventFavorites != null && eventFavorites.length > 0)
			return eventFavorites[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateEventFavoriteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateEventFavoriteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventFavoriteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateEventFavoriteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventFavoriteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventFavorite as EventFavorite");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventFavoriteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventFavorite as EventFavorite");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventFavorite", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite createEventFavorite() {
		return new socialdrink.EventFavorite();
	}
	
	public boolean save(socialdrink.EventFavorite eventFavorite) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().saveObject(eventFavorite);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(socialdrink.EventFavorite eventFavorite) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().deleteObject(eventFavorite);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(socialdrink.EventFavorite eventFavorite) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().refresh(eventFavorite);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(socialdrink.EventFavorite eventFavorite) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().evict(eventFavorite);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventFavorite loadEventFavoriteByCriteria(EventFavoriteCriteria eventFavoriteCriteria) {
		EventFavorite[] eventFavorites = listEventFavoriteByCriteria(eventFavoriteCriteria);
		if(eventFavorites == null || eventFavorites.length == 0) {
			return null;
		}
		return eventFavorites[0];
	}
	
	public EventFavorite[] listEventFavoriteByCriteria(EventFavoriteCriteria eventFavoriteCriteria) {
		return eventFavoriteCriteria.listEventFavorite();
	}
}
