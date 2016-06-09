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

public class CountryCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression cities;
	
	public CountryCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		cities = new CollectionExpression("ORM_Cities", this);
	}
	
	public CountryCriteria(PersistentSession session) {
		this(session.createCriteria(Country.class));
	}
	
	public CountryCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public CityCriteria createCitiesCriteria() {
		return new CityCriteria(createCriteria("ORM_Cities"));
	}
	
	public Country uniqueCountry() {
		return (Country) super.uniqueResult();
	}
	
	public Country[] listCountry() {
		java.util.List list = super.list();
		return (Country[]) list.toArray(new Country[list.size()]);
	}
}

