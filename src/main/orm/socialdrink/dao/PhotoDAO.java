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

public interface PhotoDAO {
	public Photo loadPhotoByORMID(int ID) throws PersistentException;
	public Photo getPhotoByORMID(int ID) throws PersistentException;
	public Photo loadPhotoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Photo getPhotoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Photo loadPhotoByORMID(PersistentSession session, int ID) throws PersistentException;
	public Photo getPhotoByORMID(PersistentSession session, int ID) throws PersistentException;
	public Photo loadPhotoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Photo getPhotoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Photo[] listPhotoByQuery(String condition, String orderBy) throws PersistentException;
	public Photo[] listPhotoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryPhoto(String condition, String orderBy) throws PersistentException;
	public java.util.List queryPhoto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iteratePhotoByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iteratePhotoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Photo[] listPhotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Photo[] listPhotoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryPhoto(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryPhoto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iteratePhotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iteratePhotoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Photo loadPhotoByQuery(String condition, String orderBy) throws PersistentException;
	public Photo loadPhotoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Photo loadPhotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Photo loadPhotoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Photo createPhoto();
	public boolean save(socialdrink.Photo photo) throws PersistentException;
	public boolean delete(socialdrink.Photo photo) throws PersistentException;
	public boolean refresh(socialdrink.Photo photo) throws PersistentException;
	public boolean evict(socialdrink.Photo photo) throws PersistentException;
	public Photo loadPhotoByCriteria(PhotoCriteria photoCriteria);
	public Photo[] listPhotoByCriteria(PhotoCriteria photoCriteria);
}
