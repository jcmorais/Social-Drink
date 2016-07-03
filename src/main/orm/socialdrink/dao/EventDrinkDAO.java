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

public interface EventDrinkDAO {
	public EventDrink loadEventDrinkByORMID(int ID) throws PersistentException;
	public EventDrink getEventDrinkByORMID(int ID) throws PersistentException;
	public EventDrink loadEventDrinkByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventDrink getEventDrinkByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventDrink loadEventDrinkByORMID(PersistentSession session, int ID) throws PersistentException;
	public EventDrink getEventDrinkByORMID(PersistentSession session, int ID) throws PersistentException;
	public EventDrink loadEventDrinkByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventDrink getEventDrinkByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventDrink[] listEventDrinkByQuery(String condition, String orderBy) throws PersistentException;
	public EventDrink[] listEventDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEventDrink(String condition, String orderBy) throws PersistentException;
	public java.util.List queryEventDrink(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventDrinkByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventDrink[] listEventDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public EventDrink[] listEventDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEventDrink(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryEventDrink(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEventDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEventDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventDrink loadEventDrinkByQuery(String condition, String orderBy) throws PersistentException;
	public EventDrink loadEventDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventDrink loadEventDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public EventDrink loadEventDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public EventDrink createEventDrink();
	public boolean save(socialdrink.EventDrink eventDrink) throws PersistentException;
	public boolean delete(socialdrink.EventDrink eventDrink) throws PersistentException;
	public boolean refresh(socialdrink.EventDrink eventDrink) throws PersistentException;
	public boolean evict(socialdrink.EventDrink eventDrink) throws PersistentException;
	public EventDrink loadEventDrinkByCriteria(EventDrinkCriteria eventDrinkCriteria);
	public EventDrink[] listEventDrinkByCriteria(EventDrinkCriteria eventDrinkCriteria);
}
