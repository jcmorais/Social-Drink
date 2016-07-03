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

public class EventDAOImpl implements socialdrink.dao.EventDAO {
	public Event loadEventByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event getEventByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getEventByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event loadEventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event getEventByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getEventByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event loadEventByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Event) session.load(socialdrink.Event.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event getEventByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Event) session.get(socialdrink.Event.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event loadEventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Event) session.load(socialdrink.Event.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event getEventByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Event) session.get(socialdrink.Event.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEvent(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryEvent(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEvent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryEvent(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event[] listEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event[] listEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEvent(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.Event as Event");
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
	
	public List queryEvent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.Event as Event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Event", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event[] listEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvent(session, condition, orderBy);
			return (Event[]) list.toArray(new Event[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event[] listEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvent(session, condition, orderBy, lockMode);
			return (Event[]) list.toArray(new Event[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event loadEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event loadEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event loadEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Event[] events = listEventByQuery(session, condition, orderBy);
		if (events != null && events.length > 0)
			return events[0];
		else
			return null;
	}
	
	public Event loadEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Event[] events = listEventByQuery(session, condition, orderBy, lockMode);
		if (events != null && events.length > 0)
			return events[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.Event as Event");
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
	
	public java.util.Iterator iterateEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.Event as Event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Event", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event createEvent() {
		return new socialdrink.Event();
	}
	
	public boolean save(socialdrink.Event event) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().saveObject(event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(socialdrink.Event event) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().deleteObject(event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(socialdrink.Event event) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().refresh(event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(socialdrink.Event event) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().evict(event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Event loadEventByCriteria(EventCriteria eventCriteria) {
		Event[] events = listEventByCriteria(eventCriteria);
		if(events == null || events.length == 0) {
			return null;
		}
		return events[0];
	}
	
	public Event[] listEventByCriteria(EventCriteria eventCriteria) {
		return eventCriteria.listEvent();
	}
}
