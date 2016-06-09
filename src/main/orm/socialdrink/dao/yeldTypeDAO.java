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

public interface yeldTypeDAO {
	public yeldType loadYeldTypeByORMID(int ID) throws PersistentException;
	public yeldType getYeldTypeByORMID(int ID) throws PersistentException;
	public yeldType loadYeldTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public yeldType getYeldTypeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public yeldType loadYeldTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public yeldType getYeldTypeByORMID(PersistentSession session, int ID) throws PersistentException;
	public yeldType loadYeldTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public yeldType getYeldTypeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public yeldType[] listYeldTypeByQuery(String condition, String orderBy) throws PersistentException;
	public yeldType[] listYeldTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryYeldType(String condition, String orderBy) throws PersistentException;
	public java.util.List queryYeldType(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateYeldTypeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateYeldTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public yeldType[] listYeldTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public yeldType[] listYeldTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryYeldType(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryYeldType(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateYeldTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateYeldTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public yeldType loadYeldTypeByQuery(String condition, String orderBy) throws PersistentException;
	public yeldType loadYeldTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public yeldType loadYeldTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public yeldType loadYeldTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public yeldType createYeldType();
	public boolean save(socialdrink.yeldType lyeldType) throws PersistentException;
	public boolean delete(socialdrink.yeldType lyeldType) throws PersistentException;
	public boolean refresh(socialdrink.yeldType lyeldType) throws PersistentException;
	public boolean evict(socialdrink.yeldType lyeldType) throws PersistentException;
	public yeldType loadYeldTypeByCriteria(yeldTypeCriteria yeldTypeCriteria);
	public yeldType[] listYeldTypeByCriteria(yeldTypeCriteria yeldTypeCriteria);
}
