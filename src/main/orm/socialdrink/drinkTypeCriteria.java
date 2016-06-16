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

public class DrinkTypeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public DrinkTypeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
	}
	
	public DrinkTypeCriteria(PersistentSession session) {
		this(session.createCriteria(DrinkType.class));
	}
	
	public DrinkTypeCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public DrinkType uniqueDrinkType() {
		return (DrinkType) super.uniqueResult();
	}
	
	public DrinkType[] listDrinkType() {
		java.util.List list = super.list();
		return (DrinkType[]) list.toArray(new DrinkType[list.size()]);
	}
}

