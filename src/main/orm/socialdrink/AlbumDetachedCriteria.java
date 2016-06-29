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
package socialdrink;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AlbumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression fotos;
	
	public AlbumDetachedCriteria() {
		super(socialdrink.Album.class, socialdrink.AlbumCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fotos = new CollectionExpression("ORM_Fotos", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.AlbumCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		fotos = new CollectionExpression("ORM_Fotos", this.getDetachedCriteria());
	}
	
	public PhotoDetachedCriteria createFotosCriteria() {
		return new PhotoDetachedCriteria(createCriteria("ORM_Fotos"));
	}
	
	public Album uniqueAlbum(PersistentSession session) {
		return (Album) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Album[] listAlbum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

