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

public interface WeekdayDAO {
	public Weekday loadWeekdayByORMID(int ID) throws PersistentException;
	public Weekday getWeekdayByORMID(int ID) throws PersistentException;
	public Weekday loadWeekdayByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Weekday getWeekdayByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Weekday loadWeekdayByORMID(PersistentSession session, int ID) throws PersistentException;
	public Weekday getWeekdayByORMID(PersistentSession session, int ID) throws PersistentException;
	public Weekday loadWeekdayByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Weekday getWeekdayByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Weekday[] listWeekdayByQuery(String condition, String orderBy) throws PersistentException;
	public Weekday[] listWeekdayByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryWeekday(String condition, String orderBy) throws PersistentException;
	public java.util.List queryWeekday(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateWeekdayByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateWeekdayByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Weekday[] listWeekdayByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Weekday[] listWeekdayByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryWeekday(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryWeekday(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateWeekdayByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateWeekdayByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Weekday loadWeekdayByQuery(String condition, String orderBy) throws PersistentException;
	public Weekday loadWeekdayByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Weekday loadWeekdayByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Weekday loadWeekdayByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Weekday createWeekday();
	public boolean save(socialdrink.Weekday weekday) throws PersistentException;
	public boolean delete(socialdrink.Weekday weekday) throws PersistentException;
	public boolean refresh(socialdrink.Weekday weekday) throws PersistentException;
	public boolean evict(socialdrink.Weekday weekday) throws PersistentException;
	public Weekday loadWeekdayByCriteria(WeekdayCriteria weekdayCriteria);
	public Weekday[] listWeekdayByCriteria(WeekdayCriteria weekdayCriteria);
}
