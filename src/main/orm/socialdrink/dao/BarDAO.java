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

public interface BarDAO {
	public Bar loadBarByORMID(int ID) throws PersistentException;
	public Bar getBarByORMID(int ID) throws PersistentException;
	public Bar loadBarByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bar getBarByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bar loadBarByORMID(PersistentSession session, int ID) throws PersistentException;
	public Bar getBarByORMID(PersistentSession session, int ID) throws PersistentException;
	public Bar loadBarByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bar getBarByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bar[] listBarByQuery(String condition, String orderBy) throws PersistentException;
	public Bar[] listBarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBar(String condition, String orderBy) throws PersistentException;
	public java.util.List queryBar(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBarByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bar[] listBarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Bar[] listBarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBar(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryBar(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bar loadBarByQuery(String condition, String orderBy) throws PersistentException;
	public Bar loadBarByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bar loadBarByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Bar loadBarByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bar createBar();
	public boolean save(socialdrink.Bar bar) throws PersistentException;
	public boolean delete(socialdrink.Bar bar) throws PersistentException;
	public boolean refresh(socialdrink.Bar bar) throws PersistentException;
	public boolean evict(socialdrink.Bar bar) throws PersistentException;
	public Bar loadBarByCriteria(BarCriteria barCriteria);
	public Bar[] listBarByCriteria(BarCriteria barCriteria);
}
