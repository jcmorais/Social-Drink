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

public interface ContactTypeDAO {
	public ContactType loadContactTypeByORMID(int ID) throws PersistentException;
	public ContactType getContactTypeByORMID(int ID) throws PersistentException;
	public ContactType loadContactTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public ContactType getContactTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public ContactType loadContactTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public ContactType getContactTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public ContactType loadContactTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public ContactType getContactTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public ContactType[] listContactTypeByQuery(String condition, String orderBy) throws PersistentException;
	public ContactType[] listContactTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryContactType(String condition, String orderBy) throws PersistentException;
	public java.util.List queryContactType(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateContactTypeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateContactTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ContactType[] listContactTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public ContactType[] listContactTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryContactType(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryContactType(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateContactTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateContactTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ContactType loadContactTypeByQuery(String condition, String orderBy) throws PersistentException;
	public ContactType loadContactTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ContactType loadContactTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public ContactType loadContactTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ContactType createContactType();
	public boolean save(socialdrink.ContactType contactType) throws PersistentException;
	public boolean delete(socialdrink.ContactType contactType) throws PersistentException;
	public boolean refresh(socialdrink.ContactType contactType) throws PersistentException;
	public boolean evict(socialdrink.ContactType contactType) throws PersistentException;
	public ContactType loadContactTypeByCriteria(ContactTypeCriteria contactTypeCriteria);
	public ContactType[] listContactTypeByCriteria(ContactTypeCriteria contactTypeCriteria);
}
