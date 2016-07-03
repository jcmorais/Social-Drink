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

public class EventDrinkDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression drinkId;
	public final AssociationExpression drink;
	
	public EventDrinkDetachedCriteria() {
		super(socialdrink.EventDrink.class, socialdrink.EventDrinkCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		drinkId = new IntegerExpression("drink.ID", this.getDetachedCriteria());
		drink = new AssociationExpression("drink", this.getDetachedCriteria());
	}
	
	public EventDrinkDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.EventDrinkCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		drinkId = new IntegerExpression("drink.ID", this.getDetachedCriteria());
		drink = new AssociationExpression("drink", this.getDetachedCriteria());
	}
	
	public DrinkDetachedCriteria createDrinkCriteria() {
		return new DrinkDetachedCriteria(createCriteria("drink"));
	}
	
	public EventDrink uniqueEventDrink(PersistentSession session) {
		return (EventDrink) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EventDrink[] listEventDrink(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EventDrink[]) list.toArray(new EventDrink[list.size()]);
	}
}

