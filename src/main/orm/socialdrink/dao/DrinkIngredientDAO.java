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

public interface DrinkIngredientDAO {
	public DrinkIngredient loadDrinkIngredientByORMID(int ID) throws PersistentException;
	public DrinkIngredient getDrinkIngredientByORMID(int ID) throws PersistentException;
	public DrinkIngredient loadDrinkIngredientByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkIngredient getDrinkIngredientByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkIngredient loadDrinkIngredientByORMID(PersistentSession session, int ID) throws PersistentException;
	public DrinkIngredient getDrinkIngredientByORMID(PersistentSession session, int ID) throws PersistentException;
	public DrinkIngredient loadDrinkIngredientByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkIngredient getDrinkIngredientByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkIngredient[] listDrinkIngredientByQuery(String condition, String orderBy) throws PersistentException;
	public DrinkIngredient[] listDrinkIngredientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDrinkIngredient(String condition, String orderBy) throws PersistentException;
	public java.util.List queryDrinkIngredient(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDrinkIngredientByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDrinkIngredientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkIngredient[] listDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public DrinkIngredient[] listDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDrinkIngredient(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryDrinkIngredient(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkIngredient loadDrinkIngredientByQuery(String condition, String orderBy) throws PersistentException;
	public DrinkIngredient loadDrinkIngredientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkIngredient loadDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public DrinkIngredient loadDrinkIngredientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkIngredient createDrinkIngredient();
	public boolean save(socialdrink.DrinkIngredient drinkIngredient) throws PersistentException;
	public boolean delete(socialdrink.DrinkIngredient drinkIngredient) throws PersistentException;
	public boolean refresh(socialdrink.DrinkIngredient drinkIngredient) throws PersistentException;
	public boolean evict(socialdrink.DrinkIngredient drinkIngredient) throws PersistentException;
	public DrinkIngredient loadDrinkIngredientByCriteria(DrinkIngredientCriteria drinkIngredientCriteria);
	public DrinkIngredient[] listDrinkIngredientByCriteria(DrinkIngredientCriteria drinkIngredientCriteria);
}
