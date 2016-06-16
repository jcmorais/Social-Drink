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

public class DrinkTypeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public DrinkTypeDetachedCriteria() {
		super(socialdrink.DrinkType.class, socialdrink.DrinkTypeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public DrinkTypeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.DrinkTypeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public DrinkType uniqueDrinkType(PersistentSession session) {
		return (DrinkType) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DrinkType[] listDrinkType(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DrinkType[]) list.toArray(new DrinkType[list.size()]);
	}
}

