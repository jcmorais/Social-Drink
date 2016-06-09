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

public class drinkTypeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public drinkTypeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
	}
	
	public drinkTypeCriteria(PersistentSession session) {
		this(session.createCriteria(drinkType.class));
	}
	
	public drinkTypeCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public drinkType uniqueDrinkType() {
		return (drinkType) super.uniqueResult();
	}
	
	public drinkType[] listDrinkType() {
		java.util.List list = super.list();
		return (drinkType[]) list.toArray(new drinkType[list.size()]);
	}
}

