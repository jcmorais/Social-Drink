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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PhotoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression filePath;
	
	public PhotoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		filePath = new StringExpression("filePath", this);
	}
	
	public PhotoCriteria(PersistentSession session) {
		this(session.createCriteria(Photo.class));
	}
	
	public PhotoCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public Photo uniquePhoto() {
		return (Photo) super.uniqueResult();
	}
	
	public Photo[] listPhoto() {
		java.util.List list = super.list();
		return (Photo[]) list.toArray(new Photo[list.size()]);
	}
}

