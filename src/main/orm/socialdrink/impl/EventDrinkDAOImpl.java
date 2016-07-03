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

public class EventDrinkDAOImpl implements socialdrink.dao.EventDrinkDAO {
	public EventDrink loadEventDrinkByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventDrinkByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink getEventDrinkByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getEventDrinkByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink loadEventDrinkByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventDrinkByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink getEventDrinkByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getEventDrinkByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink loadEventDrinkByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventDrink) session.load(socialdrink.EventDrink.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink getEventDrinkByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventDrink) session.get(socialdrink.EventDrink.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink loadEventDrinkByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventDrink) session.load(socialdrink.EventDrink.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink getEventDrinkByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventDrink) session.get(socialdrink.EventDrink.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventDrink(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryEventDrink(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventDrink(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryEventDrink(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink[] listEventDrinkByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listEventDrinkByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink[] listEventDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listEventDrinkByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventDrink(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventDrink as EventDrink");
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
	
	public List queryEventDrink(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventDrink as EventDrink");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventDrink", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink[] listEventDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEventDrink(session, condition, orderBy);
			return (EventDrink[]) list.toArray(new EventDrink[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink[] listEventDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEventDrink(session, condition, orderBy, lockMode);
			return (EventDrink[]) list.toArray(new EventDrink[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink loadEventDrinkByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventDrinkByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink loadEventDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventDrinkByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink loadEventDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EventDrink[] eventDrinks = listEventDrinkByQuery(session, condition, orderBy);
		if (eventDrinks != null && eventDrinks.length > 0)
			return eventDrinks[0];
		else
			return null;
	}
	
	public EventDrink loadEventDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EventDrink[] eventDrinks = listEventDrinkByQuery(session, condition, orderBy, lockMode);
		if (eventDrinks != null && eventDrinks.length > 0)
			return eventDrinks[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateEventDrinkByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateEventDrinkByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateEventDrinkByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventDrink as EventDrink");
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
	
	public java.util.Iterator iterateEventDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventDrink as EventDrink");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventDrink", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink createEventDrink() {
		return new socialdrink.EventDrink();
	}
	
	public boolean save(socialdrink.EventDrink eventDrink) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().saveObject(eventDrink);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(socialdrink.EventDrink eventDrink) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().deleteObject(eventDrink);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(socialdrink.EventDrink eventDrink) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().refresh(eventDrink);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(socialdrink.EventDrink eventDrink) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().evict(eventDrink);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventDrink loadEventDrinkByCriteria(EventDrinkCriteria eventDrinkCriteria) {
		EventDrink[] eventDrinks = listEventDrinkByCriteria(eventDrinkCriteria);
		if(eventDrinks == null || eventDrinks.length == 0) {
			return null;
		}
		return eventDrinks[0];
	}
	
	public EventDrink[] listEventDrinkByCriteria(EventDrinkCriteria eventDrinkCriteria) {
		return eventDrinkCriteria.listEventDrink();
	}
}
