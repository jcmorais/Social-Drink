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

public interface CountryDAO {
	public Country loadCountryByORMID(int ID) throws PersistentException;
	public Country getCountryByORMID(int ID) throws PersistentException;
	public Country loadCountryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Country getCountryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Country loadCountryByORMID(PersistentSession session, int ID) throws PersistentException;
	public Country getCountryByORMID(PersistentSession session, int ID) throws PersistentException;
	public Country loadCountryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Country getCountryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Country[] listCountryByQuery(String condition, String orderBy) throws PersistentException;
	public Country[] listCountryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryCountry(String condition, String orderBy) throws PersistentException;
	public java.util.List queryCountry(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateCountryByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateCountryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Country[] listCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Country[] listCountryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryCountry(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryCountry(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateCountryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Country loadCountryByQuery(String condition, String orderBy) throws PersistentException;
	public Country loadCountryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Country loadCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Country loadCountryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Country createCountry();
	public boolean save(socialdrink.Country country) throws PersistentException;
	public boolean delete(socialdrink.Country country) throws PersistentException;
	public boolean deleteAndDissociate(socialdrink.Country country) throws PersistentException;
	public boolean deleteAndDissociate(socialdrink.Country country, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(socialdrink.Country country) throws PersistentException;
	public boolean evict(socialdrink.Country country) throws PersistentException;
	public Country loadCountryByCriteria(CountryCriteria countryCriteria);
	public Country[] listCountryByCriteria(CountryCriteria countryCriteria);
}
