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

public interface DosageDAO {
	public Dosage loadDosageByORMID(int ID) throws PersistentException;
	public Dosage getDosageByORMID(int ID) throws PersistentException;
	public Dosage loadDosageByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Dosage getDosageByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Dosage loadDosageByORMID(PersistentSession session, int ID) throws PersistentException;
	public Dosage getDosageByORMID(PersistentSession session, int ID) throws PersistentException;
	public Dosage loadDosageByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Dosage getDosageByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Dosage[] listDosageByQuery(String condition, String orderBy) throws PersistentException;
	public Dosage[] listDosageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDosage(String condition, String orderBy) throws PersistentException;
	public java.util.List queryDosage(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDosageByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDosageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Dosage[] listDosageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Dosage[] listDosageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDosage(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryDosage(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDosageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDosageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Dosage loadDosageByQuery(String condition, String orderBy) throws PersistentException;
	public Dosage loadDosageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Dosage loadDosageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Dosage loadDosageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Dosage createDosage();
	public boolean save(socialdrink.Dosage dosage) throws PersistentException;
	public boolean delete(socialdrink.Dosage dosage) throws PersistentException;
	public boolean refresh(socialdrink.Dosage dosage) throws PersistentException;
	public boolean evict(socialdrink.Dosage dosage) throws PersistentException;
	public Dosage loadDosageByCriteria(DosageCriteria dosageCriteria);
	public Dosage[] listDosageByCriteria(DosageCriteria dosageCriteria);
}
