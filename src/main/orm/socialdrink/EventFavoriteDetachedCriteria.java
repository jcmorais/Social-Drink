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

public class EventFavoriteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression drinkId;
	public final AssociationExpression drink;
	
	public EventFavoriteDetachedCriteria() {
		super(socialdrink.EventFavorite.class, socialdrink.EventFavoriteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		drinkId = new IntegerExpression("drink.ID", this.getDetachedCriteria());
		drink = new AssociationExpression("drink", this.getDetachedCriteria());
	}
	
	public EventFavoriteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.EventFavoriteCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		drinkId = new IntegerExpression("drink.ID", this.getDetachedCriteria());
		drink = new AssociationExpression("drink", this.getDetachedCriteria());
	}
	
	public DrinkDetachedCriteria createDrinkCriteria() {
		return new DrinkDetachedCriteria(createCriteria("drink"));
	}
	
	public EventFavorite uniqueEventFavorite(PersistentSession session) {
		return (EventFavorite) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EventFavorite[] listEventFavorite(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EventFavorite[]) list.toArray(new EventFavorite[list.size()]);
	}
}

