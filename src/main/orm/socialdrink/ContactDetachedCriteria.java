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

public class ContactDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression contactTypeId;
	public final AssociationExpression contactType;
	public final StringExpression contact;
	
	public ContactDetachedCriteria() {
		super(socialdrink.Contact.class, socialdrink.ContactCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		contactTypeId = new IntegerExpression("contactType.ID", this.getDetachedCriteria());
		contactType = new AssociationExpression("contactType", this.getDetachedCriteria());
		contact = new StringExpression("contact", this.getDetachedCriteria());
	}
	
	public ContactDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.ContactCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		contactTypeId = new IntegerExpression("contactType.ID", this.getDetachedCriteria());
		contactType = new AssociationExpression("contactType", this.getDetachedCriteria());
		contact = new StringExpression("contact", this.getDetachedCriteria());
	}
	
	public ContactTypeDetachedCriteria createContactTypeCriteria() {
		return new ContactTypeDetachedCriteria(createCriteria("contactType"));
	}
	
	public Contact uniqueContact(PersistentSession session) {
		return (Contact) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contact[] listContact(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contact[]) list.toArray(new Contact[list.size()]);
	}
}

