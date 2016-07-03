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

public class EventFavoriteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression drinkId;
	public final AssociationExpression drink;
	
	public EventFavoriteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		drinkId = new IntegerExpression("drink.ID", this);
		drink = new AssociationExpression("drink", this);
	}
	
	public EventFavoriteCriteria(PersistentSession session) {
		this(session.createCriteria(EventFavorite.class));
	}
	
	public EventFavoriteCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public DrinkCriteria createDrinkCriteria() {
		return new DrinkCriteria(createCriteria("drink"));
	}
	
	public EventFavorite uniqueEventFavorite() {
		return (EventFavorite) super.uniqueResult();
	}
	
	public EventFavorite[] listEventFavorite() {
		java.util.List list = super.list();
		return (EventFavorite[]) list.toArray(new EventFavorite[list.size()]);
	}
}

