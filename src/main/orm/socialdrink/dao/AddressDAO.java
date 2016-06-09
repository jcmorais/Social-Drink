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

public interface AddressDAO {
	public Address loadAddressByORMID(int ID) throws PersistentException;
	public Address getAddressByORMID(int ID) throws PersistentException;
	public Address loadAddressByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Address getAddressByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Address loadAddressByORMID(PersistentSession session, int ID) throws PersistentException;
	public Address getAddressByORMID(PersistentSession session, int ID) throws PersistentException;
	public Address loadAddressByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Address getAddressByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Address[] listAddressByQuery(String condition, String orderBy) throws PersistentException;
	public Address[] listAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryAddress(String condition, String orderBy) throws PersistentException;
	public java.util.List queryAddress(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateAddressByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Address[] listAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Address[] listAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryAddress(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryAddress(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Address loadAddressByQuery(String condition, String orderBy) throws PersistentException;
	public Address loadAddressByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Address loadAddressByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Address loadAddressByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Address createAddress();
	public boolean save(socialdrink.Address address) throws PersistentException;
	public boolean delete(socialdrink.Address address) throws PersistentException;
	public boolean refresh(socialdrink.Address address) throws PersistentException;
	public boolean evict(socialdrink.Address address) throws PersistentException;
	public Address loadAddressByCriteria(AddressCriteria addressCriteria);
	public Address[] listAddressByCriteria(AddressCriteria addressCriteria);
}
