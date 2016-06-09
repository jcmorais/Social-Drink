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

public interface CityDAO {
	public City loadCityByORMID(int ID) throws PersistentException;
	public City getCityByORMID(int ID) throws PersistentException;
	public City loadCityByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public City getCityByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public City loadCityByORMID(PersistentSession session, int ID) throws PersistentException;
	public City getCityByORMID(PersistentSession session, int ID) throws PersistentException;
	public City loadCityByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public City getCityByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public City[] listCityByQuery(String condition, String orderBy) throws PersistentException;
	public City[] listCityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryCity(String condition, String orderBy) throws PersistentException;
	public java.util.List queryCity(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateCityByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateCityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public City[] listCityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public City[] listCityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryCity(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryCity(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateCityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateCityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public City loadCityByQuery(String condition, String orderBy) throws PersistentException;
	public City loadCityByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public City loadCityByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public City loadCityByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public City createCity();
	public boolean save(socialdrink.City city) throws PersistentException;
	public boolean delete(socialdrink.City city) throws PersistentException;
	public boolean deleteAndDissociate(socialdrink.City city) throws PersistentException;
	public boolean deleteAndDissociate(socialdrink.City city, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(socialdrink.City city) throws PersistentException;
	public boolean evict(socialdrink.City city) throws PersistentException;
	public City loadCityByCriteria(CityCriteria cityCriteria);
	public City[] listCityByCriteria(CityCriteria cityCriteria);
}
