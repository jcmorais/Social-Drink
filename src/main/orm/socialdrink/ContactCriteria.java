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

public class ContactCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression contactTypeId;
	public final AssociationExpression contactType;
	public final StringExpression contact;
	
	public ContactCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		contactTypeId = new IntegerExpression("contactType.ID", this);
		contactType = new AssociationExpression("contactType", this);
		contact = new StringExpression("contact", this);
	}
	
	public ContactCriteria(PersistentSession session) {
		this(session.createCriteria(Contact.class));
	}
	
	public ContactCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public contactTypeCriteria createContactTypeCriteria() {
		return new contactTypeCriteria(createCriteria("contactType"));
	}
	
	public Contact uniqueContact() {
		return (Contact) super.uniqueResult();
	}
	
	public Contact[] listContact() {
		java.util.List list = super.list();
		return (Contact[]) list.toArray(new Contact[list.size()]);
	}
}

