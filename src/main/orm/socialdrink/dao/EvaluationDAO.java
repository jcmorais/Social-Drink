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

public interface EvaluationDAO {
	public Evaluation loadEvaluationByORMID(int ID) throws PersistentException;
	public Evaluation getEvaluationByORMID(int ID) throws PersistentException;
	public Evaluation loadEvaluationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Evaluation getEvaluationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Evaluation loadEvaluationByORMID(PersistentSession session, int ID) throws PersistentException;
	public Evaluation getEvaluationByORMID(PersistentSession session, int ID) throws PersistentException;
	public Evaluation loadEvaluationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Evaluation getEvaluationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Evaluation[] listEvaluationByQuery(String condition, String orderBy) throws PersistentException;
	public Evaluation[] listEvaluationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEvaluation(String condition, String orderBy) throws PersistentException;
	public java.util.List queryEvaluation(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEvaluationByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEvaluationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Evaluation[] listEvaluationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Evaluation[] listEvaluationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryEvaluation(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryEvaluation(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateEvaluationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateEvaluationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Evaluation loadEvaluationByQuery(String condition, String orderBy) throws PersistentException;
	public Evaluation loadEvaluationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Evaluation loadEvaluationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Evaluation loadEvaluationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Evaluation createEvaluation();
	public boolean save(socialdrink.Evaluation evaluation) throws PersistentException;
	public boolean delete(socialdrink.Evaluation evaluation) throws PersistentException;
	public boolean refresh(socialdrink.Evaluation evaluation) throws PersistentException;
	public boolean evict(socialdrink.Evaluation evaluation) throws PersistentException;
	public Evaluation loadEvaluationByCriteria(EvaluationCriteria evaluationCriteria);
	public Evaluation[] listEvaluationByCriteria(EvaluationCriteria evaluationCriteria);
}
