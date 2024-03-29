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

public class EventCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	
	public EventCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
	}
	
	public EventCriteria(PersistentSession session) {
		this(session.createCriteria(Event.class));
	}
	
	public EventCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public Event uniqueEvent() {
		return (Event) super.uniqueResult();
	}
	
	public Event[] listEvent() {
		java.util.List list = super.list();
		return (Event[]) list.toArray(new Event[list.size()]);
	}
}

