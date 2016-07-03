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

public class EventDrinkCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression drinkId;
	public final AssociationExpression drink;
	
	public EventDrinkCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		drinkId = new IntegerExpression("drink.ID", this);
		drink = new AssociationExpression("drink", this);
	}
	
	public EventDrinkCriteria(PersistentSession session) {
		this(session.createCriteria(EventDrink.class));
	}
	
	public EventDrinkCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public DrinkCriteria createDrinkCriteria() {
		return new DrinkCriteria(createCriteria("drink"));
	}
	
	public EventDrink uniqueEventDrink() {
		return (EventDrink) super.uniqueResult();
	}
	
	public EventDrink[] listEventDrink() {
		java.util.List list = super.list();
		return (EventDrink[]) list.toArray(new EventDrink[list.size()]);
	}
}

