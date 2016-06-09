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

public class WeekdayDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression day;
	public final BooleanExpression isOpen;
	public final IntegerExpression opening;
	public final IntegerExpression closure;
	
	public WeekdayDetachedCriteria() {
		super(socialdrink.Weekday.class, socialdrink.WeekdayCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		day = new StringExpression("day", this.getDetachedCriteria());
		isOpen = new BooleanExpression("isOpen", this.getDetachedCriteria());
		opening = new IntegerExpression("opening", this.getDetachedCriteria());
		closure = new IntegerExpression("closure", this.getDetachedCriteria());
	}
	
	public WeekdayDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.WeekdayCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		day = new StringExpression("day", this.getDetachedCriteria());
		isOpen = new BooleanExpression("isOpen", this.getDetachedCriteria());
		opening = new IntegerExpression("opening", this.getDetachedCriteria());
		closure = new IntegerExpression("closure", this.getDetachedCriteria());
	}
	
	public Weekday uniqueWeekday(PersistentSession session) {
		return (Weekday) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Weekday[] listWeekday(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Weekday[]) list.toArray(new Weekday[list.size()]);
	}
}

