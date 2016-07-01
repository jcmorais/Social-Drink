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

public class WeekdayCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression day;
	public final StringExpression opening;
	public final StringExpression closure;
	
	public WeekdayCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		day = new IntegerExpression("day", this);
		opening = new StringExpression("opening", this);
		closure = new StringExpression("closure", this);
	}
	
	public WeekdayCriteria(PersistentSession session) {
		this(session.createCriteria(Weekday.class));
	}
	
	public WeekdayCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public Weekday uniqueWeekday() {
		return (Weekday) super.uniqueResult();
	}
	
	public Weekday[] listWeekday() {
		java.util.List list = super.list();
		return (Weekday[]) list.toArray(new Weekday[list.size()]);
	}
}

