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

public interface IngredientDAO {
	public Ingredient loadIngredientByORMID(int ID) throws PersistentException;
	public Ingredient getIngredientByORMID(int ID) throws PersistentException;
	public Ingredient loadIngredientByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Ingredient getIngredientByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Ingredient loadIngredientByORMID(PersistentSession session, int ID) throws PersistentException;
	public Ingredient getIngredientByORMID(PersistentSession session, int ID) throws PersistentException;
	public Ingredient loadIngredientByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Ingredient getIngredientByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Ingredient[] listIngredientByQuery(String condition, String orderBy) throws PersistentException;
	public Ingredient[] listIngredientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryIngredient(String condition, String orderBy) throws PersistentException;
	public java.util.List queryIngredient(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateIngredientByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateIngredientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Ingredient[] listIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Ingredient[] listIngredientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryIngredient(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryIngredient(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateIngredientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Ingredient loadIngredientByQuery(String condition, String orderBy) throws PersistentException;
	public Ingredient loadIngredientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Ingredient loadIngredientByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Ingredient loadIngredientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Ingredient createIngredient();
	public boolean save(socialdrink.Ingredient ingredient) throws PersistentException;
	public boolean delete(socialdrink.Ingredient ingredient) throws PersistentException;
	public boolean refresh(socialdrink.Ingredient ingredient) throws PersistentException;
	public boolean evict(socialdrink.Ingredient ingredient) throws PersistentException;
	public Ingredient loadIngredientByCriteria(IngredientCriteria ingredientCriteria);
	public Ingredient[] listIngredientByCriteria(IngredientCriteria ingredientCriteria);
}
