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

public class DrinkCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression typeOfDrinkId;
	public final AssociationExpression typeOfDrink;
	public final IntegerExpression photoId;
	public final AssociationExpression photo;
	public final StringExpression name;
	public final StringExpression description;
	public final IntegerExpression timeToPrepate;
	public final IntegerExpression yeld;
	public final CollectionExpression evaluation;
	public final CollectionExpression ingredients;
	public final CollectionExpression steps;
	
	public DrinkCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		typeOfDrinkId = new IntegerExpression("typeOfDrink.ID", this);
		typeOfDrink = new AssociationExpression("typeOfDrink", this);
		photoId = new IntegerExpression("photo.ID", this);
		photo = new AssociationExpression("photo", this);
		name = new StringExpression("name", this);
		description = new StringExpression("description", this);
		timeToPrepate = new IntegerExpression("timeToPrepate", this);
		yeld = new IntegerExpression("yeld", this);
		evaluation = new CollectionExpression("ORM_Evaluation", this);
		ingredients = new CollectionExpression("ORM_Ingredients", this);
		steps = new CollectionExpression("ORM_Steps", this);
	}
	
	public DrinkCriteria(PersistentSession session) {
		this(session.createCriteria(Drink.class));
	}
	
	public DrinkCriteria() throws PersistentException {
		this(socialdrink.SocialDrinkPersistentManager.instance().getSession());
	}
	
	public DrinkTypeCriteria createTypeOfDrinkCriteria() {
		return new DrinkTypeCriteria(createCriteria("typeOfDrink"));
	}
	
	public PhotoCriteria createPhotoCriteria() {
		return new PhotoCriteria(createCriteria("photo"));
	}
	
	public EvaluationCriteria createEvaluationCriteria() {
		return new EvaluationCriteria(createCriteria("ORM_Evaluation"));
	}
	
	public DrinkIngredientCriteria createIngredientsCriteria() {
		return new DrinkIngredientCriteria(createCriteria("ORM_Ingredients"));
	}
	
	public StepCriteria createStepsCriteria() {
		return new StepCriteria(createCriteria("ORM_Steps"));
	}
	
	public Drink uniqueDrink() {
		return (Drink) super.uniqueResult();
	}
	
	public Drink[] listDrink() {
		java.util.List list = super.list();
		return (Drink[]) list.toArray(new Drink[list.size()]);
	}
}

