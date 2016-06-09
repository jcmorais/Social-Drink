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

public class AddressCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression cityId;
	public final AssociationExpression city;
	public final StringExpression street;
	public final StringExpression postalCode;
	
	public AddressCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		cityId = new IntegerExpression("city.ID", this);
		city = new AssociationExpression("city", this);
		street = new StringExpression("street", this);
		postalCode = new StringExpression("postalCode", this);
	}
	
	public AddressCriteria(PersistentSession session) {
		this(session.createCriteria(Address.class));
	}
	
	public AddressCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public CityCriteria createCityCriteria() {
		return new CityCriteria(createCriteria("city"));
	}
	
	public Address uniqueAddress() {
		return (Address) super.uniqueResult();
	}
	
	public Address[] listAddress() {
		java.util.List list = super.list();
		return (Address[]) list.toArray(new Address[list.size()]);
	}
}

