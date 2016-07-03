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

public class EventEvalDAOImpl implements socialdrink.dao.EventEvalDAO {
	public EventEval loadEventEvalByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventEvalByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval getEventEvalByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getEventEvalByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval loadEventEvalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventEvalByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval getEventEvalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getEventEvalByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval loadEventEvalByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventEval) session.load(socialdrink.EventEval.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval getEventEvalByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventEval) session.get(socialdrink.EventEval.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval loadEventEvalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventEval) session.load(socialdrink.EventEval.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval getEventEvalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventEval) session.get(socialdrink.EventEval.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventEval(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryEventEval(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventEval(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryEventEval(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval[] listEventEvalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listEventEvalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval[] listEventEvalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listEventEvalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryEventEval(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventEval as EventEval");
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
	
	public List queryEventEval(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventEval as EventEval");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventEval", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval[] listEventEvalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEventEval(session, condition, orderBy);
			return (EventEval[]) list.toArray(new EventEval[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval[] listEventEvalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEventEval(session, condition, orderBy, lockMode);
			return (EventEval[]) list.toArray(new EventEval[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval loadEventEvalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventEvalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval loadEventEvalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadEventEvalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval loadEventEvalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EventEval[] eventEvals = listEventEvalByQuery(session, condition, orderBy);
		if (eventEvals != null && eventEvals.length > 0)
			return eventEvals[0];
		else
			return null;
	}
	
	public EventEval loadEventEvalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EventEval[] eventEvals = listEventEvalByQuery(session, condition, orderBy, lockMode);
		if (eventEvals != null && eventEvals.length > 0)
			return eventEvals[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateEventEvalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateEventEvalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventEvalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateEventEvalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateEventEvalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventEval as EventEval");
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
	
	public java.util.Iterator iterateEventEvalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.EventEval as EventEval");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventEval", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval createEventEval() {
		return new socialdrink.EventEval();
	}
	
	public boolean save(socialdrink.EventEval eventEval) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().saveObject(eventEval);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(socialdrink.EventEval eventEval) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().deleteObject(eventEval);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(socialdrink.EventEval eventEval) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().refresh(eventEval);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(socialdrink.EventEval eventEval) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().evict(eventEval);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public EventEval loadEventEvalByCriteria(EventEvalCriteria eventEvalCriteria) {
		EventEval[] eventEvals = listEventEvalByCriteria(eventEvalCriteria);
		if(eventEvals == null || eventEvals.length == 0) {
			return null;
		}
		return eventEvals[0];
	}
	
	public EventEval[] listEventEvalByCriteria(EventEvalCriteria eventEvalCriteria) {
		return eventEvalCriteria.listEventEval();
	}
}
