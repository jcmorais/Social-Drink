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

public class drinkTypeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public drinkTypeDetachedCriteria() {
		super(socialdrink.drinkType.class, socialdrink.drinkTypeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public drinkTypeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.drinkTypeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public drinkType uniqueDrinkType(PersistentSession session) {
		return (drinkType) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public drinkType[] listDrinkType(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (drinkType[]) list.toArray(new drinkType[list.size()]);
	}
}

