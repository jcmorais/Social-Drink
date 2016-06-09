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

public class CityDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression countryId;
	public final AssociationExpression country;
	public final StringExpression name;
	
	public CityDetachedCriteria() {
		super(socialdrink.City.class, socialdrink.CityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		countryId = new IntegerExpression("country.ID", this.getDetachedCriteria());
		country = new AssociationExpression("country", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public CityDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.CityCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		countryId = new IntegerExpression("country.ID", this.getDetachedCriteria());
		country = new AssociationExpression("country", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public CountryDetachedCriteria createCountryCriteria() {
		return new CountryDetachedCriteria(createCriteria("country"));
	}
	
	public City uniqueCity(PersistentSession session) {
		return (City) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public City[] listCity(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (City[]) list.toArray(new City[list.size()]);
	}
}

