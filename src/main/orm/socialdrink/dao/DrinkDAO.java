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

public interface DrinkDAO {
	public Drink loadDrinkByORMID(int ID) throws PersistentException;
	public Drink getDrinkByORMID(int ID) throws PersistentException;
	public Drink loadDrinkByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Drink getDrinkByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Drink loadDrinkByORMID(PersistentSession session, int ID) throws PersistentException;
	public Drink getDrinkByORMID(PersistentSession session, int ID) throws PersistentException;
	public Drink loadDrinkByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Drink getDrinkByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Drink[] listDrinkByQuery(String condition, String orderBy) throws PersistentException;
	public Drink[] listDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDrink(String condition, String orderBy) throws PersistentException;
	public java.util.List queryDrink(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDrinkByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Drink[] listDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Drink[] listDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDrink(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryDrink(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Drink loadDrinkByQuery(String condition, String orderBy) throws PersistentException;
	public Drink loadDrinkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Drink loadDrinkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Drink loadDrinkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Drink createDrink();
	public boolean save(socialdrink.Drink drink) throws PersistentException;
	public boolean delete(socialdrink.Drink drink) throws PersistentException;
	public boolean refresh(socialdrink.Drink drink) throws PersistentException;
	public boolean evict(socialdrink.Drink drink) throws PersistentException;
	public Drink loadDrinkByCriteria(DrinkCriteria drinkCriteria);
	public Drink[] listDrinkByCriteria(DrinkCriteria drinkCriteria);
}
