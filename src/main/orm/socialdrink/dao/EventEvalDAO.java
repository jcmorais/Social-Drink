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

public interface EventEvalDAO {
	public EventEval loadEventEvalByORMID(int ID) throws PersistentException;
	public EventEval getEventEvalByORMID(int ID) throws PersistentException;
	public EventEval loadEventEvalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventEval getEventEvalByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventEval loadEventEvalByORMID(PersistentSession session, int ID) throws PersistentException;
	public EventEval getEventEvalByORMID(PersistentSession session, int ID) throws PersistentException;
	public EventEval loadEventEvalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventEval getEventEvalByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventEval[] listEventEvalByQuery(String condition, String orderBy) throws PersistentException;
	public EventEval[] listEventEvalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEventEval(String condition, String orderBy) throws PersistentException;
	public java.util.List queryEventEval(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventEvalByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventEvalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventEval[] listEventEvalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public EventEval[] listEventEvalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEventEval(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryEventEval(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventEvalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventEvalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventEval loadEventEvalByQuery(String condition, String orderBy) throws PersistentException;
	public EventEval loadEventEvalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventEval loadEventEvalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public EventEval loadEventEvalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventEval createEventEval();
	public boolean save(socialdrink.EventEval eventEval) throws PersistentException;
	public boolean delete(socialdrink.EventEval eventEval) throws PersistentException;
	public boolean refresh(socialdrink.EventEval eventEval) throws PersistentException;
	public boolean evict(socialdrink.EventEval eventEval) throws PersistentException;
	public EventEval loadEventEvalByCriteria(EventEvalCriteria eventEvalCriteria);
	public EventEval[] listEventEvalByCriteria(EventEvalCriteria eventEvalCriteria);
}
