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

public class CountryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression cities;
	
	public CountryDetachedCriteria() {
		super(socialdrink.Country.class, socialdrink.CountryCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		cities = new CollectionExpression("ORM_Cities", this.getDetachedCriteria());
	}
	
	public CountryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.CountryCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		cities = new CollectionExpression("ORM_Cities", this.getDetachedCriteria());
	}
	
	public CityDetachedCriteria createCitiesCriteria() {
		return new CityDetachedCriteria(createCriteria("ORM_Cities"));
	}
	
	public Country uniqueCountry(PersistentSession session) {
		return (Country) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Country[] listCountry(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Country[]) list.toArray(new Country[list.size()]);
	}
}

