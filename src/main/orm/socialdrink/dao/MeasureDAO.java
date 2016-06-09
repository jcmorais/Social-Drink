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

public interface MeasureDAO {
	public Measure loadMeasureByORMID(int ID) throws PersistentException;
	public Measure getMeasureByORMID(int ID) throws PersistentException;
	public Measure loadMeasureByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Measure getMeasureByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Measure loadMeasureByORMID(PersistentSession session, int ID) throws PersistentException;
	public Measure getMeasureByORMID(PersistentSession session, int ID) throws PersistentException;
	public Measure loadMeasureByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Measure getMeasureByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Measure[] listMeasureByQuery(String condition, String orderBy) throws PersistentException;
	public Measure[] listMeasureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMeasure(String condition, String orderBy) throws PersistentException;
	public java.util.List queryMeasure(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMeasureByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMeasureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Measure[] listMeasureByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Measure[] listMeasureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMeasure(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryMeasure(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMeasureByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMeasureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Measure loadMeasureByQuery(String condition, String orderBy) throws PersistentException;
	public Measure loadMeasureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Measure loadMeasureByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Measure loadMeasureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Measure createMeasure();
	public boolean save(socialdrink.Measure measure) throws PersistentException;
	public boolean delete(socialdrink.Measure measure) throws PersistentException;
	public boolean refresh(socialdrink.Measure measure) throws PersistentException;
	public boolean evict(socialdrink.Measure measure) throws PersistentException;
	public Measure loadMeasureByCriteria(MeasureCriteria measureCriteria);
	public Measure[] listMeasureByCriteria(MeasureCriteria measureCriteria);
}
