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

public class CityCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression countryId;
	public final AssociationExpression country;
	public final StringExpression name;
	
	public CityCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		countryId = new IntegerExpression("country.ID", this);
		country = new AssociationExpression("country", this);
		name = new StringExpression("name", this);
	}
	
	public CityCriteria(PersistentSession session) {
		this(session.createCriteria(City.class));
	}
	
	public CityCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public CountryCriteria createCountryCriteria() {
		return new CountryCriteria(createCriteria("country"));
	}
	
	public City uniqueCity() {
		return (City) super.uniqueResult();
	}
	
	public City[] listCity() {
		java.util.List list = super.list();
		return (City[]) list.toArray(new City[list.size()]);
	}
}

