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

public class EventDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	
	public EventDetachedCriteria() {
		super(socialdrink.Event.class, socialdrink.EventCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public EventDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.EventCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public Event uniqueEvent(PersistentSession session) {
		return (Event) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Event[] listEvent(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Event[]) list.toArray(new Event[list.size()]);
	}
}

