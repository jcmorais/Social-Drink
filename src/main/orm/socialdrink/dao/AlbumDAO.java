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

public interface AlbumDAO {
	public Album loadAlbumByORMID(int ID) throws PersistentException;
	public Album getAlbumByORMID(int ID) throws PersistentException;
	public Album loadAlbumByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Album getAlbumByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Album loadAlbumByORMID(PersistentSession session, int ID) throws PersistentException;
	public Album getAlbumByORMID(PersistentSession session, int ID) throws PersistentException;
	public Album loadAlbumByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Album getAlbumByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Album[] listAlbumByQuery(String condition, String orderBy) throws PersistentException;
	public Album[] listAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryAlbum(String condition, String orderBy) throws PersistentException;
	public java.util.List queryAlbum(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateAlbumByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Album[] listAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Album[] listAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryAlbum(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryAlbum(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Album loadAlbumByQuery(String condition, String orderBy) throws PersistentException;
	public Album loadAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Album loadAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Album loadAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Album createAlbum();
	public boolean save(socialdrink.Album album) throws PersistentException;
	public boolean delete(socialdrink.Album album) throws PersistentException;
	public boolean refresh(socialdrink.Album album) throws PersistentException;
	public boolean evict(socialdrink.Album album) throws PersistentException;
	public Album loadAlbumByCriteria(AlbumCriteria albumCriteria);
	public Album[] listAlbumByCriteria(AlbumCriteria albumCriteria);
}
