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

public interface DrinkTypeDAO {
	public DrinkType loadDrinkTypeByORMID(int ID) throws PersistentException;
	public DrinkType getDrinkTypeByORMID(int ID) throws PersistentException;
	public DrinkType loadDrinkTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkType getDrinkTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkType loadDrinkTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public DrinkType getDrinkTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public DrinkType loadDrinkTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkType getDrinkTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkType[] listDrinkTypeByQuery(String condition, String orderBy) throws PersistentException;
	public DrinkType[] listDrinkTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDrinkType(String condition, String orderBy) throws PersistentException;
	public java.util.List queryDrinkType(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDrinkTypeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDrinkTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkType[] listDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public DrinkType[] listDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDrinkType(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryDrinkType(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkType loadDrinkTypeByQuery(String condition, String orderBy) throws PersistentException;
	public DrinkType loadDrinkTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkType loadDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public DrinkType loadDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DrinkType createDrinkType();
	public boolean save(socialdrink.DrinkType drinkType) throws PersistentException;
	public boolean delete(socialdrink.DrinkType drinkType) throws PersistentException;
	public boolean refresh(socialdrink.DrinkType drinkType) throws PersistentException;
	public boolean evict(socialdrink.DrinkType drinkType) throws PersistentException;
	public DrinkType loadDrinkTypeByCriteria(DrinkTypeCriteria drinkTypeCriteria);
	public DrinkType[] listDrinkTypeByCriteria(DrinkTypeCriteria drinkTypeCriteria);
}
