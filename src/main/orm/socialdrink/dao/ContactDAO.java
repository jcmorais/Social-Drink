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

public interface ContactDAO {
	public Contact loadContactByORMID(int ID) throws PersistentException;
	public Contact getContactByORMID(int ID) throws PersistentException;
	public Contact loadContactByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Contact getContactByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Contact loadContactByORMID(PersistentSession session, int ID) throws PersistentException;
	public Contact getContactByORMID(PersistentSession session, int ID) throws PersistentException;
	public Contact loadContactByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Contact getContactByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Contact[] listContactByQuery(String condition, String orderBy) throws PersistentException;
	public Contact[] listContactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryContact(String condition, String orderBy) throws PersistentException;
	public java.util.List queryContact(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateContactByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateContactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Contact[] listContactByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Contact[] listContactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryContact(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryContact(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateContactByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateContactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Contact loadContactByQuery(String condition, String orderBy) throws PersistentException;
	public Contact loadContactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Contact loadContactByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Contact loadContactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Contact createContact();
	public boolean save(socialdrink.Contact contact) throws PersistentException;
	public boolean delete(socialdrink.Contact contact) throws PersistentException;
	public boolean refresh(socialdrink.Contact contact) throws PersistentException;
	public boolean evict(socialdrink.Contact contact) throws PersistentException;
	public Contact loadContactByCriteria(ContactCriteria contactCriteria);
	public Contact[] listContactByCriteria(ContactCriteria contactCriteria);
}
