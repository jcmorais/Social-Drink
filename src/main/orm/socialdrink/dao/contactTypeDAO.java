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

public interface contactTypeDAO {
	public contactType loadContactTypeByORMID(int ID) throws PersistentException;
	public contactType getContactTypeByORMID(int ID) throws PersistentException;
	public contactType loadContactTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public contactType getContactTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public contactType loadContactTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public contactType getContactTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public contactType loadContactTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public contactType getContactTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public contactType[] listContactTypeByQuery(String condition, String orderBy) throws PersistentException;
	public contactType[] listContactTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryContactType(String condition, String orderBy) throws PersistentException;
	public java.util.List queryContactType(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateContactTypeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateContactTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public contactType[] listContactTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public contactType[] listContactTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryContactType(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryContactType(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateContactTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateContactTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public contactType loadContactTypeByQuery(String condition, String orderBy) throws PersistentException;
	public contactType loadContactTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public contactType loadContactTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public contactType loadContactTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public contactType createContactType();
	public boolean save(socialdrink.contactType lcontactType) throws PersistentException;
	public boolean delete(socialdrink.contactType lcontactType) throws PersistentException;
	public boolean refresh(socialdrink.contactType lcontactType) throws PersistentException;
	public boolean evict(socialdrink.contactType lcontactType) throws PersistentException;
	public contactType loadContactTypeByCriteria(contactTypeCriteria contactTypeCriteria);
	public contactType[] listContactTypeByCriteria(contactTypeCriteria contactTypeCriteria);
}
