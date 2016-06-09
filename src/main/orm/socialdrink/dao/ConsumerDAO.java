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

public interface ConsumerDAO {
	public Consumer loadConsumerByORMID(int ID) throws PersistentException;
	public Consumer getConsumerByORMID(int ID) throws PersistentException;
	public Consumer loadConsumerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Consumer getConsumerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Consumer loadConsumerByORMID(PersistentSession session, int ID) throws PersistentException;
	public Consumer getConsumerByORMID(PersistentSession session, int ID) throws PersistentException;
	public Consumer loadConsumerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Consumer getConsumerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Consumer[] listConsumerByQuery(String condition, String orderBy) throws PersistentException;
	public Consumer[] listConsumerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryConsumer(String condition, String orderBy) throws PersistentException;
	public java.util.List queryConsumer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateConsumerByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateConsumerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Consumer[] listConsumerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Consumer[] listConsumerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryConsumer(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryConsumer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateConsumerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateConsumerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Consumer loadConsumerByQuery(String condition, String orderBy) throws PersistentException;
	public Consumer loadConsumerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Consumer loadConsumerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Consumer loadConsumerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Consumer createConsumer();
	public boolean save(socialdrink.Consumer consumer) throws PersistentException;
	public boolean delete(socialdrink.Consumer consumer) throws PersistentException;
	public boolean refresh(socialdrink.Consumer consumer) throws PersistentException;
	public boolean evict(socialdrink.Consumer consumer) throws PersistentException;
	public Consumer loadConsumerByCriteria(ConsumerCriteria consumerCriteria);
	public Consumer[] listConsumerByCriteria(ConsumerCriteria consumerCriteria);
}
