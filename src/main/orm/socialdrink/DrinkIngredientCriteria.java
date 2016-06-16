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

public class DrinkIngredientCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression ingredientId;
	public final AssociationExpression ingredient;
	public final StringExpression amount;
	
	public DrinkIngredientCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		ingredientId = new IntegerExpression("ingredient.ID", this);
		ingredient = new AssociationExpression("ingredient", this);
		amount = new StringExpression("amount", this);
	}
	
	public DrinkIngredientCriteria(PersistentSession session) {
		this(session.createCriteria(DrinkIngredient.class));
	}
	
	public DrinkIngredientCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public IngredientCriteria createIngredientCriteria() {
		return new IngredientCriteria(createCriteria("ingredient"));
	}
	
	public DrinkIngredient uniqueDrinkIngredient() {
		return (DrinkIngredient) super.uniqueResult();
	}
	
	public DrinkIngredient[] listDrinkIngredient() {
		java.util.List list = super.list();
		return (DrinkIngredient[]) list.toArray(new DrinkIngredient[list.size()]);
	}
}

