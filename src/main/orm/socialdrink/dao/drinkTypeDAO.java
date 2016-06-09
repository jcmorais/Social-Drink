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

public interface drinkTypeDAO {
	public drinkType loadDrinkTypeByORMID(int ID) throws PersistentException;
	public drinkType getDrinkTypeByORMID(int ID) throws PersistentException;
	public drinkType loadDrinkTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public drinkType getDrinkTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public drinkType loadDrinkTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public drinkType getDrinkTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public drinkType loadDrinkTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public drinkType getDrinkTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public drinkType[] listDrinkTypeByQuery(String condition, String orderBy) throws PersistentException;
	public drinkType[] listDrinkTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDrinkType(String condition, String orderBy) throws PersistentException;
	public java.util.List queryDrinkType(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDrinkTypeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDrinkTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public drinkType[] listDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public drinkType[] listDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDrinkType(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryDrinkType(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public drinkType loadDrinkTypeByQuery(String condition, String orderBy) throws PersistentException;
	public drinkType loadDrinkTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public drinkType loadDrinkTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public drinkType loadDrinkTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public drinkType createDrinkType();
	public boolean save(socialdrink.drinkType ldrinkType) throws PersistentException;
	public boolean delete(socialdrink.drinkType ldrinkType) throws PersistentException;
	public boolean refresh(socialdrink.drinkType ldrinkType) throws PersistentException;
	public boolean evict(socialdrink.drinkType ldrinkType) throws PersistentException;
	public drinkType loadDrinkTypeByCriteria(drinkTypeCriteria drinkTypeCriteria);
	public drinkType[] listDrinkTypeByCriteria(drinkTypeCriteria drinkTypeCriteria);
}
