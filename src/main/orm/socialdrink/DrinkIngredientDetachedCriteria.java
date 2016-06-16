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

public class DrinkIngredientDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression ingredientId;
	public final AssociationExpression ingredient;
	public final StringExpression amount;
	
	public DrinkIngredientDetachedCriteria() {
		super(socialdrink.DrinkIngredient.class, socialdrink.DrinkIngredientCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		ingredientId = new IntegerExpression("ingredient.ID", this.getDetachedCriteria());
		ingredient = new AssociationExpression("ingredient", this.getDetachedCriteria());
		amount = new StringExpression("amount", this.getDetachedCriteria());
	}
	
	public DrinkIngredientDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.DrinkIngredientCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		ingredientId = new IntegerExpression("ingredient.ID", this.getDetachedCriteria());
		ingredient = new AssociationExpression("ingredient", this.getDetachedCriteria());
		amount = new StringExpression("amount", this.getDetachedCriteria());
	}
	
	public IngredientDetachedCriteria createIngredientCriteria() {
		return new IngredientDetachedCriteria(createCriteria("ingredient"));
	}
	
	public DrinkIngredient uniqueDrinkIngredient(PersistentSession session) {
		return (DrinkIngredient) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DrinkIngredient[] listDrinkIngredient(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DrinkIngredient[]) list.toArray(new DrinkIngredient[list.size()]);
	}
}

