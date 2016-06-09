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

public class IngredientCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public IngredientCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
	}
	
	public IngredientCriteria(PersistentSession session) {
		this(session.createCriteria(Ingredient.class));
	}
	
	public IngredientCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public Ingredient uniqueIngredient() {
		return (Ingredient) super.uniqueResult();
	}
	
	public Ingredient[] listIngredient() {
		java.util.List list = super.list();
		return (Ingredient[]) list.toArray(new Ingredient[list.size()]);
	}
}

