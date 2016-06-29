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
package socialdrink.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import socialdrink.*;

public class AlbumDAOImpl implements socialdrink.dao.AlbumDAO {
	public Album loadAlbumByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadAlbumByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album getAlbumByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getAlbumByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album loadAlbumByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadAlbumByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album getAlbumByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return getAlbumByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album loadAlbumByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Album) session.load(socialdrink.Album.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album getAlbumByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Album) session.get(socialdrink.Album.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album loadAlbumByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Album) session.load(socialdrink.Album.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album getAlbumByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Album) session.get(socialdrink.Album.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryAlbum(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryAlbum(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryAlbum(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return queryAlbum(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album[] listAlbumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listAlbumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album[] listAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return listAlbumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryAlbum(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.Album as Album");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryAlbum(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.Album as Album");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Album", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album[] listAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAlbum(session, condition, orderBy);
			return (Album[]) list.toArray(new Album[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album[] listAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAlbum(session, condition, orderBy, lockMode);
			return (Album[]) list.toArray(new Album[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album loadAlbumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadAlbumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album loadAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return loadAlbumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album loadAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Album[] albums = listAlbumByQuery(session, condition, orderBy);
		if (albums != null && albums.length > 0)
			return albums[0];
		else
			return null;
	}
	
	public Album loadAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Album[] albums = listAlbumByQuery(session, condition, orderBy, lockMode);
		if (albums != null && albums.length > 0)
			return albums[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateAlbumByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateAlbumByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateAlbumByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = socialdrink.SocialDrinkPersistentManager.instance().getSession();
			return iterateAlbumByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateAlbumByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.Album as Album");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateAlbumByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From socialdrink.Album as Album");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Album", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album createAlbum() {
		return new socialdrink.Album();
	}
	
	public boolean save(socialdrink.Album album) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().saveObject(album);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(socialdrink.Album album) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().deleteObject(album);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(socialdrink.Album album) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().refresh(album);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(socialdrink.Album album) throws PersistentException {
		try {
			socialdrink.SocialDrinkPersistentManager.instance().getSession().evict(album);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Album loadAlbumByCriteria(AlbumCriteria albumCriteria) {
		Album[] albums = listAlbumByCriteria(albumCriteria);
		if(albums == null || albums.length == 0) {
			return null;
		}
		return albums[0];
	}
	
	public Album[] listAlbumByCriteria(AlbumCriteria albumCriteria) {
		return albumCriteria.listAlbum();
	}
}
