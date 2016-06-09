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

public interface StepDAO {
	public Step loadStepByORMID(int ID) throws PersistentException;
	public Step getStepByORMID(int ID) throws PersistentException;
	public Step loadStepByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Step getStepByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Step loadStepByORMID(PersistentSession session, int ID) throws PersistentException;
	public Step getStepByORMID(PersistentSession session, int ID) throws PersistentException;
	public Step loadStepByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Step getStepByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Step[] listStepByQuery(String condition, String orderBy) throws PersistentException;
	public Step[] listStepByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryStep(String condition, String orderBy) throws PersistentException;
	public java.util.List queryStep(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateStepByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateStepByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Step[] listStepByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Step[] listStepByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryStep(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryStep(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateStepByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateStepByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Step loadStepByQuery(String condition, String orderBy) throws PersistentException;
	public Step loadStepByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Step loadStepByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Step loadStepByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Step createStep();
	public boolean save(socialdrink.Step step) throws PersistentException;
	public boolean delete(socialdrink.Step step) throws PersistentException;
	public boolean refresh(socialdrink.Step step) throws PersistentException;
	public boolean evict(socialdrink.Step step) throws PersistentException;
	public Step loadStepByCriteria(StepCriteria stepCriteria);
	public Step[] listStepByCriteria(StepCriteria stepCriteria);
}
