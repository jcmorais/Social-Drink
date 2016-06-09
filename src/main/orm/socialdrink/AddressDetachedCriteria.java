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

public class AddressDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression cityId;
	public final AssociationExpression city;
	public final StringExpression street;
	public final StringExpression postalCode;
	
	public AddressDetachedCriteria() {
		super(socialdrink.Address.class, socialdrink.AddressCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		cityId = new IntegerExpression("city.ID", this.getDetachedCriteria());
		city = new AssociationExpression("city", this.getDetachedCriteria());
		street = new StringExpression("street", this.getDetachedCriteria());
		postalCode = new StringExpression("postalCode", this.getDetachedCriteria());
	}
	
	public AddressDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.AddressCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		cityId = new IntegerExpression("city.ID", this.getDetachedCriteria());
		city = new AssociationExpression("city", this.getDetachedCriteria());
		street = new StringExpression("street", this.getDetachedCriteria());
		postalCode = new StringExpression("postalCode", this.getDetachedCriteria());
	}
	
	public CityDetachedCriteria createCityCriteria() {
		return new CityDetachedCriteria(createCriteria("city"));
	}
	
	public Address uniqueAddress(PersistentSession session) {
		return (Address) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Address[] listAddress(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Address[]) list.toArray(new Address[list.size()]);
	}
}

