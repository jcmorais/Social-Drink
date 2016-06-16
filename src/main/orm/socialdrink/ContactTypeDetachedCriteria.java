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

public class ContactTypeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public ContactTypeDetachedCriteria() {
		super(socialdrink.ContactType.class, socialdrink.ContactTypeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public ContactTypeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.ContactTypeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public ContactType uniqueContactType(PersistentSession session) {
		return (ContactType) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ContactType[] listContactType(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ContactType[]) list.toArray(new ContactType[list.size()]);
	}
}
