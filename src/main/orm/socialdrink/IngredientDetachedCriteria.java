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

public class IngredientDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	
	public IngredientDetachedCriteria() {
		super(socialdrink.Ingredient.class, socialdrink.IngredientCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public IngredientDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, socialdrink.IngredientCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public Ingredient uniqueIngredient(PersistentSession session) {
		return (Ingredient) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Ingredient[] listIngredient(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Ingredient[]) list.toArray(new Ingredient[list.size()]);
	}
}

